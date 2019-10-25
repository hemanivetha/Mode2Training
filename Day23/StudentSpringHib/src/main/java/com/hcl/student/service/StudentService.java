package com.hcl.student.service;

import java.util.List;

import com.hcl.student.model.Student;

public interface StudentService {
	
	public void addStudent(Student student);

	public List<Student> getAllStudent();

	public void deleteStudent(Integer rollNum);

	public Student getStudent(int rollNum);

	public Student updateStudent(Student student);
}
