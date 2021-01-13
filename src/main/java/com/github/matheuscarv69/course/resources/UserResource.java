package com.github.matheuscarv69.course.resources;

import com.github.matheuscarv69.course.entities.User;
import com.github.matheuscarv69.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
//        User u = new User(1L,"maria", "maria@gmail.com", "9999999", "123456");
        List<User> list = repository.findAll();
        return ResponseEntity.ok().body(list);
    }

}
