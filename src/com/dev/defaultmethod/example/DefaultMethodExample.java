package com.dev.defaultmethod.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.dev.Student;
import com.dev.StudentDataBase;

public class DefaultMethodExample {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Devendra", "Sonali", "Devanshi", "Aveera");
		//Collections.sort(names);
		names.sort(Comparator.reverseOrder());
		System.out.println("Sort name: "+ names);
		
		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
		Comparator<Student> gradeLevelComparator = Comparator.comparing(Student::getGradeLevel);
		Consumer<Student> studentConsumer = student -> System.out.println(student);
		
		List<Student> students = StudentDataBase.getAllStudents();
		//System.out.println(students);
		
		students.sort(gradeLevelComparator.thenComparing(nameComparator));
		students.forEach(studentConsumer);
	
		
		
		
		
		
	}

}
