package com.projects.springbootProject.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projects.springbootProject.sms.entity.Student;
import com.projects.springbootProject.sms.repository.StudentRepository;
import com.projects.springbootProject.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll(); // return list of students
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
