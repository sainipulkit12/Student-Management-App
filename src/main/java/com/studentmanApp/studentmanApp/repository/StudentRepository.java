package com.studentmanApp.studentmanApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanApp.studentmanApp.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
