package org.lanqiao.service.impl;

import java.util.List;

import org.lanqiao.entity.Student;
import org.lanqiao.mapper.StudentMapper;
import org.lanqiao.service.StudentService;

public class StudentServiceImpl implements StudentService {
	//serviceÒÀÀµÓÚdao(mapper)
	private StudentMapper  studentMapper ;
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}


	@Override
	public Student queryStudentByNo(int stuNo) {
		return  studentMapper.queryStudentByStuno(stuNo) ;
	}


	@Override
	public void addStudent(Student student) {
		studentMapper.addStudent(student);
	}
	
	public void deleteStudentByStuno(int stuno) {
		studentMapper.deleteStudentByStuno(stuno);
	}
	
	public void updateStudentByStuno(Student student){
		studentMapper.updateStudentByStuno(student);
	}
	
	public List<Student> queryStudents(){
		return studentMapper.queryStudents();
	}
}
