package com.hcl.student.dao;

import java.util.List;

import com.hcl.student.model.Student;

public interface StudentDao {

	public void addStudent(Student student);

	public List<Student> getAllStudent();

	public void deleteStudent(Integer rollNum);

	public Student updateStudent(Student student);

	public Student getStudent(int rollNum);
}
