package com.montezumadev.coursesplatformapi.dao;

import com.montezumadev.coursesplatformapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
