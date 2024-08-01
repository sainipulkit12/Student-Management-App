package com.studentmanApp.studentmanApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanApp.studentmanApp.entities.Student;
import com.studentmanApp.studentmanApp.repository.StudentRepository;

@Service
public class StudentServicesImp implements StudentServices {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Optional<Student> getStudent(Long id) {
		return studentRepository.findById(id);
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) throws Exception {
		if (!studentRepository.findById(student.getId()).isPresent()) {
			throw new Exception("Not a valid student to update");
		}
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
}
