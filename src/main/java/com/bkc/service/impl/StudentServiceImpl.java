package com.bkc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bkc.dao.StudentMapper;
import com.bkc.pojo.po.Student;
import com.bkc.service.IStudentService;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

	@Resource
	private StudentMapper studentDao;

	public Student get(int id) {
		return studentDao.selectByPrimaryKey(id);
	}

	public int add(Student student) {
		return studentDao.insert(student);
	}

	public void delete(int id) {
		studentDao.deleteByPrimaryKey(id);
	}
}
