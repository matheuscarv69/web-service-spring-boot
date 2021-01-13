package com.github.matheuscarv69.course.repositories;

import com.github.matheuscarv69.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {


}
