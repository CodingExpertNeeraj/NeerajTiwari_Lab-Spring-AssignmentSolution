package com.greatlearning.StudentManagementApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.StudentManagementApp.entity.Student;

/**
 * 
 * @author Neeraj Tiwari
 *
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}