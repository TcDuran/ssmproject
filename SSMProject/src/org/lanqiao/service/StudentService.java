package org.lanqiao.service;

import java.util.List;

import org.lanqiao.entity.Student;

public interface StudentService {
		Student queryStudentByNo(int stuNo);
		void addStudent(Student student);
		void deleteStudentByStuno(int stuno);
		void updateStudentByStuno(Student student);	
		List<Student> queryStudents();
}
