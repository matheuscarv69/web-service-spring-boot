package com.github.matheuscarv69.course.repositories;

import com.github.matheuscarv69.course.entities.Category;
import com.github.matheuscarv69.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {



}
