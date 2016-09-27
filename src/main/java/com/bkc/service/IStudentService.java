package com.bkc.service;

import com.bkc.pojo.po.Student;

public interface IStudentService {

	Student get(int id);

	int add(Student student);

	void delete(int id);
}
