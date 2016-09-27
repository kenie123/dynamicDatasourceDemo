package com.bkc.controller.mysql;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bkc.pojo.po.Student;
import com.bkc.service.IStudentService;

@Controller
@RequestMapping("/student/")
public class StudentController {

	@Autowired
	private IStudentService studentService;

	@RequestMapping(value = "get")
	public String get(@RequestParam Integer id, Model model) {
		Student student = studentService.get(id);
		model.addAttribute("student", student);
		return "student";
	}

	@RequestMapping(value = "add")
	public String add(Student student, Model model) {
		int id = studentService.add(student);
		model.addAttribute("id", id);
		return "student";
	}

	@RequestMapping(value = "delete")
	public String delete(@RequestParam Integer id, Model model) {
		studentService.delete(id);
		model.addAttribute("delFlag", true);
		return "student";
	}
}
