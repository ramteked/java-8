package com.dev.optional.example;

import java.util.Optional;

import com.dev.Student;
import com.dev.StudentDataBase;

public class OptionalExamples {

	public static Optional<String> getStudentNameOptional() {
		Optional<Student> student = Optional.ofNullable(StudentDataBase.aStudent.get());
		return student.isPresent() ? student.map(Student::getName) : Optional.empty();
	}

	public static void main(String[] args) {

		Optional<String> studentName = getStudentNameOptional();
		if(studentName.isPresent()) { 
			System.out.println("Student name length : "+studentName.get().length());
		}else {
			System.out.println("Student not found.......");
		}

	}

}
