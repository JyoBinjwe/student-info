package com.org.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.example.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
