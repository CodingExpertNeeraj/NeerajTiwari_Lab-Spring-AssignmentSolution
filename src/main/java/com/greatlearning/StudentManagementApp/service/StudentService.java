package com.greatlearning.StudentManagementApp.service;

import java.util.List;

import com.greatlearning.StudentManagementApp.entity.Student;

/**
 * @author Neeraj Tiwari
 * Student service interface
 */
public interface StudentService {

	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student student);

	public void deleteById(int theId);

	

}
