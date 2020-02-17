package org.lanqiao.controller;

import java.util.List;
import java.util.Map;

import org.lanqiao.entity.Student;
import org.lanqiao.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("controller")
@Controller//StudentController加入Ioc容器
public class StudentController {
	//控制器依赖于Service
	@Autowired
	@Qualifier("studentService") 
	private StudentService  studentService;
		
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
//	查询全部学生
	@RequestMapping("queryStudents")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<Student> students = studentService.queryStudents();
		mav.addObject("students", students);
		mav.setViewName("queryAllstudent");
		return mav;
	}



//	返回主页
	@RequestMapping("fanhui")
	public ModelAndView fanhui() {
		ModelAndView mav = new ModelAndView("redirect:/index.jsp");
		return mav;
	}
	@RequestMapping("queryStudentByNo/{stuno}")
	public String queryStudentByNo(@PathVariable("stuno") Integer stuNo ,Map<String,Object> map) {
		Student student = studentService.queryStudentByNo(stuNo) ;
		map.put("student", student) ;
		return "result" ;
	}  
	
	@RequestMapping("addStudent")
	public String addStudent(Student student) {
		studentService.addStudent(student) ;
		return "result" ;
	}  
	@RequestMapping("deleteStudentByStuno/{stuno}")
	public String deleteStudentByStuno(@PathVariable("stuno") Integer stuNo ) {
		studentService.deleteStudentByStuno(stuNo) ;
		return "redirect:/controller/queryStudents" ;
	}  
	
	@RequestMapping("updateStudentByStuno/{stuno}")
	public String updateStudentByStuno(@PathVariable("stuno") Integer stuNo,Map<String,Object> map ) {
		Student student = studentService.queryStudentByNo(stuNo) ;
		map.put("student", student) ;
		return "update" ;
	}  
	@RequestMapping("updateStudentByStuno1/updateStudent")
	public ModelAndView updateStudentByStuno(Student student) {
		 studentService.updateStudentByStuno(student);
		ModelAndView mv = new ModelAndView("redirect:/controller/queryStudents");
		return mv ;
	}  
	
	@RequestMapping("updateStudentByStuno1/{stuno}")
	public ModelAndView editgo(@PathVariable("stuno") Integer stuNo) {
		Student student = studentService.queryStudentByNo(stuNo) ;
		ModelAndView mav = new ModelAndView("update");
		mav.addObject("student", student);
		return mav;
	}



}
