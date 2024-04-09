package com.projects.springbootProject.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.springbootProject.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
