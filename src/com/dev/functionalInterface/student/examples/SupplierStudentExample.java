package com.dev.functionalInterface.student.examples;

import java.util.List;
import java.util.function.Supplier;

import com.dev.Student;
import com.dev.StudentDataBase;

public class SupplierStudentExample {
	
	public static void main(String[] args) {
		List<Student> students = StudentDataBase.getAllStudents();
		Supplier<List<Student>> studentSupplier = () -> students;
		System.out.println(studentSupplier.get());
	}

}
