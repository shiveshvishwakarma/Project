package com.lcwd.electronic.store.services.impl;

import com.lcwd.electronic.store.dtos.CategoryDto;
import com.lcwd.electronic.store.dtos.PageableResponse;
import com.lcwd.electronic.store.exception.ResourceNotfoundException;
import com.lcwd.electronic.store.helper.Helper;
import com.lcwd.electronic.store.repositories.CategoryRepository;
import com.lcwd.electronic.store.services.CategoryService;
import jdk.jfr.Category;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.UUID;


@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper mapper;
    @Override
    public CategoryDto create(CategoryDto categoryDto) {

        //Creating categoryId:randomly

        String categoryId = UUID.randomUUID().toString();
        categoryDto.setCategoriesId(categoryId);
        Category category =mapper.map(categoryDto, Category.class);
        Category savedCategory = categoryRepository.save(category);
        return mapper.map(savedCategory, CategoryDto.class);
    }

    @Override
    public CategoryDto update(CategoryDto categoryDto, String categoryId) {
        Category category =categoryRepository.findById(categoryId).orElseThrow(() -> new ResourceNotfoundException("Category not found Exception!!"));

        //update category details
//        category.setTitle(categoryDto.getTitle());
//        category.set

        return null;
    }

    @Override
    public void delete(String categoryId) {
        Category category =categoryRepository.findById(categoryId).orElseThrow(() -> new ResourceNotfoundException("Category not found Exception!!"));
        categoryRepository.delete(category);


    }

    @Override
    public PageableResponse<CategoryDto> getall(int pageNumber,int pageSize, String sortBy, String sortDir) {

        Sort sort=(sortDir.equalsIgnoreCase("desc")) ? (Sort.by(sortBy).descending()) : (Sort.by(sortBy).ascending());
        Pageable pageable = (Pageable) PageRequest.of(pageNumber,pageSize, sort);
        Page<Category> page =  categoryRepository.findAll((org.springframework.data.domain.Pageable) pageable);

        PageableResponse<CategoryDto> pageableResponse =Helper.getPageableResponse(page, CategoryDto.class);
        return pageableResponse;
    }

    @Override
    public CategoryDto get(String categoryId) {
        Category category =categoryRepository.findById(categoryId).orElseThrow(() -> new ResourceNotfoundException("Category not found Exception!!"));

        return mapper.map(category, CategoryDto.class);
    }
}
