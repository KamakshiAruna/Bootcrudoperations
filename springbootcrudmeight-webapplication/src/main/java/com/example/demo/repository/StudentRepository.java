package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.dto.StudentDto;


public interface StudentRepository extends JpaRepository<StudentDto, Integer>{

}
