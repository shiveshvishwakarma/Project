package com.lcwd.electronic.store.repositories;

import com.lcwd.electronic.store.entities.Product;
import jdk.jfr.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product,String>{
    //Search



    Page<Product> findByTitleContaining(String subTitle,Pageable pageable);
    Page<Product> findByLiveTrue(Pageable pageable);

    Page<Product> findByCategory(Category category,Pageable pageable);
    //other methods
    //query methods
}
