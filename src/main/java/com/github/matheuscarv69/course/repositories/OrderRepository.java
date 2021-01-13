package com.github.matheuscarv69.course.repositories;

import com.github.matheuscarv69.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {


}
