package com.projects.springbootProject.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projects.springbootProject.sms.entity.Student;
import com.projects.springbootProject.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		/*Student student1 = new Student("Dang", "Hoang", "hoangdung.dang@uphf.fr");
		studentRepository.save(student1);
		
		Student student2 = new Student("Nguyen", "Tram", "ngoctram.nguyen@uphf.fr");
		studentRepository.save(student2);
		
		Student student3 = new Student("Ong", "Bi", "ongbicute@gmail.com");
		studentRepository.save(student3);*/
		
	}

}
