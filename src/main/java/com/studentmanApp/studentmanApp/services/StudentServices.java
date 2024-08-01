package com.studentmanApp.studentmanApp.services;

import java.util.List;
import java.util.Optional;

import com.studentmanApp.studentmanApp.entities.Student;

public interface StudentServices {

	public List<Student> getAllStudents();

	Optional<Student> getStudent(Long id);

	Student addStudent(Student student);

	Student updateStudent(Student student) throws Exception;

	void deleteStudent(Long id);
}
