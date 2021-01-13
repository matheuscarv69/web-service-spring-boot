package com.github.matheuscarv69.course.repositories;

import com.github.matheuscarv69.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
