package com.springboot.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	// add
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void add(@RequestBody Student student) {
		System.out.println("Add suucess");
	}

	// update
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody Student student) {
		System.out.println("Update suucess");
	}

	// get
	@RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Student get(@PathVariable String id) {
		System.out.println("Get suucess");
		Student student = new Student();
		student.setId("1");
		student.setCourse("M.C.A");
		student.setName("Murali");
		student.setGender("Male");
		return student;
	}

	// delete
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		System.out.println("Delete suucess");
	}

}
