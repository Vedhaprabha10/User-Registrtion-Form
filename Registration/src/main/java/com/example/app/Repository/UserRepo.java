package com.example.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{

}
