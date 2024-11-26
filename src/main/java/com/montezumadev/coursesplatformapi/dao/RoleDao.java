package com.montezumadev.coursesplatformapi.dao;

import com.montezumadev.coursesplatformapi.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
