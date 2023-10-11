package com.lcwd.electronic.store.repositories;

import com.lcwd.electronic.store.entities.Categories;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Locale;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
