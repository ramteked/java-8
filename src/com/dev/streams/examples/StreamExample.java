package com.dev.streams.examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.dev.Student;
import com.dev.StudentDataBase;

public class StreamExample {

	public static void main(String[] args) {
		
		Map<String, List<String>> studentActivities = StudentDataBase.getAllStudents().stream()
													  .peek(student -> System.out.println("Student details : "+student))	
				                                      .filter(student -> student.getGradeLevel() >= 3)
				                                      .peek(student -> System.out.println("Student details after 1st filter: "+student))	
				                                      .filter(student -> student.getGpa() >= 3.9)
				                                      .peek(student -> System.out.println("Student details after 2st filter: "+student))	
				                                      .collect(Collectors.toMap(Student::getName, Student::getActivities));
			System.out.println(studentActivities);
	}

}
