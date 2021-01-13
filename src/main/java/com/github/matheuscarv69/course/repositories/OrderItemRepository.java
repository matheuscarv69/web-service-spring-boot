package com.github.matheuscarv69.course.repositories;

import com.github.matheuscarv69.course.entities.OrderItem;
import com.github.matheuscarv69.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {


}
