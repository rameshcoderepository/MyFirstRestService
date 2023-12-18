package com.uniq.MyFirstRestService.MyFirstRestService.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniq.MyFirstRestService.MyFirstRestService.bean.Course;


@RestController
public class CourseController {

	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return Arrays.asList(new Course(1, "Learn Java Full Stack Course", "UniqTechnologies"),
				new Course(2, "Learn Javascript Full Stack Course", "UniqTechnologies"),
				new Course(3, "Learn Machine Learning", "UniqTechnologies"));
	}

	// http://localhost:8080/courses/1
	@GetMapping("/courses/1")
	public Course getCourseDetails() {

		return new Course(1, "Learn Java Full Stack Course", "UniqTechnologies");
	}

}