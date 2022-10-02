package com.example.usuarios.userRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.usuarios.userEntity.User;

public interface UserRepo extends JpaRepository<User, Long>{
    @Query("Select c FROM Customer c WHERE c.code = ?1")
    public User FindByCode(String code);
}
