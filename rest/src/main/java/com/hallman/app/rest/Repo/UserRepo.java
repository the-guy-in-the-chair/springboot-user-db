package com.hallman.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hallman.app.rest.Models.User;

public interface UserRepo extends JpaRepository<User, Long> {

}