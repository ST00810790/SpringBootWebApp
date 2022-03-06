package com.suwathi.SpringBootWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suwathi.SpringBootWebApp.model.Student;




@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}