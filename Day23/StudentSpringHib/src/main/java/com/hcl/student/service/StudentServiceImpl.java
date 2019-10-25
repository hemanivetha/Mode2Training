package com.hcl.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.student.dao.StudentDao;
import com.hcl.student.model.Student;
import com.jwt.dao.EmployeeDAO;
import com.jwt.model.Employee;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	@Transactional
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	@Override
	@Transactional
	public List<Student> getAllStudent() {
		return studentDao.getAllStudent();
	}

	@Override
	@Transactional
	public void deleteStudent(Integer rollNum) {
		studentDao.deleteStudent(rollNum);
	}

	public Student getStudent(int rollNum) {
		return studentDao.getStudent(rollNum);
	}

	public Student updateEmployee(Student student) {
		// TODO Auto-generated method stub
		return studentDao.updateStudent(student);
	}

	public void setEmployeeDAO(StudentDao studentDao ) {
		this.studentDao = studentDao;
	}

}
