package com.example.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ems.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    // Custom query methods, if any
}