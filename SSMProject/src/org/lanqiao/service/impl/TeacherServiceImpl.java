package org.lanqiao.service.impl;

import java.util.List;

import org.lanqiao.entity.Teacher;
import org.lanqiao.mapper.StudentMapper;
import org.lanqiao.mapper.TeacherMapper;
import org.lanqiao.service.TeacherService;

public class TeacherServiceImpl implements TeacherService{
	private TeacherMapper  teacherMapper ;


	public void setTeacherMapper(TeacherMapper teacherMapper) {
		this.teacherMapper = teacherMapper;
	}
	
	public List<Teacher> queryTeachers(){
		return teacherMapper.queryTeachers();
	}

	
}
