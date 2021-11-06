package com.dev.streams.examples;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.dev.Student;
import com.dev.StudentDataBase;

public class MapExample {
	
	public static void main(String[] args) {
		
		printStudentList();
		printStudentSet();
	}
	
	public static void printStudentList() {
		System.out.println("printStudentList");
		List<String> studentName = StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.toList());
		System.out.println(studentName);
	}

	public static void printStudentSet() {
		System.out.println("printStudentSet");
		Set<String> studentName = StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.toSet());
		System.out.println(studentName);
	}
}
