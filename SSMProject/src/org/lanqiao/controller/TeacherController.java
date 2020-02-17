package org.lanqiao.controller;

import org.lanqiao.entity.Teacher;
import org.lanqiao.service.StudentService;
import org.lanqiao.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@RequestMapping("controller1")
@Controller
public class TeacherController {
	@Autowired
	@Qualifier("teacherService")
	private TeacherService  teacherService;

	
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
}
