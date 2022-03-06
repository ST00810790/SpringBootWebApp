package com.suwathi.SpringBootWebApp.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.suwathi.SpringBootWebApp.model.Student;





public interface StudentService {
	List<Student> getAllStudents();
	void saveStudent(Student student);
	Student getStudentById(long id);
	void deleteStudentById(long id);
	Page<Student> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
