package com.dev.streams.examples;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.dev.Student;
import com.dev.StudentDataBase;

public class FlatMapExample {
	
	public static void main(String[] args) {
		printStudentActivities();
		printStudentDetailsByName();
	}
	
	public static  void printStudentActivities() {
	 List<String> studentActivities =	StudentDataBase.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.distinct()
		.sorted()
		.collect(Collectors.toList());
	 System.out.println(studentActivities);
	}
	
	public static void printStudentDetailsByName() {
	   List<Student> studentByName =	StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList());
	   System.out.println(studentByName);
	}
	
	

}
