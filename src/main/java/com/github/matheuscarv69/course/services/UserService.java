package com.github.matheuscarv69.course.services;

import com.github.matheuscarv69.course.entities.User;
import com.github.matheuscarv69.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = repository.findById(id);
        return user.get();
    }

    public User insert(User obj){
        return repository.save(obj);
    }

//    public void remove(Integer id){
//        User obj =
//    }

}
