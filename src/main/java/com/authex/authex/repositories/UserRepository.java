package com.authex.authex.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authex.authex.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{


    
}