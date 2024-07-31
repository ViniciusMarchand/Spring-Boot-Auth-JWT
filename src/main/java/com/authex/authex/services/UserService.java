package com.authex.authex.services;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.authex.authex.models.User;

public interface UserService extends CrudRepository<User, String> {
    Optional<User> findByUsername(String username);
  }