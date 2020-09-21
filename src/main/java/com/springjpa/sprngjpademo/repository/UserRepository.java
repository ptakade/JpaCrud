package com.springjpa.sprngjpademo.repository;

import com.springjpa.sprngjpademo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
