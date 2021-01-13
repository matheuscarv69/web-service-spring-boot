package com.github.matheuscarv69.course.services;

import com.github.matheuscarv69.course.entities.Order;
import com.github.matheuscarv69.course.repositories.OrderRepository;
import com.github.matheuscarv69.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> Order = repository.findById(id);
        return Order.get();
    }

}