package org.lanqiao.mapper;

import java.util.List;

import org.lanqiao.entity.Student;

public interface StudentMapper {
	public void addStudent(Student student);

	Student queryStudentByStuno(int stuno);
	
	void deleteStudentByStuno(int stuno);
	
	void updateStudentByStuno(Student student);

	List<Student> queryStudents();
}
