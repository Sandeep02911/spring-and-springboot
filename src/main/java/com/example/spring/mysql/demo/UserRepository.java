package com.example.spring.mysql.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.spring.mysql.demo.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
