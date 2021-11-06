package com.dev.functionalInterface.student.examples;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import com.dev.Student;
import com.dev.StudentDataBase;

public class FunctionStudentExample {

	static List<Student> students = StudentDataBase.getAllStudents();
	static Predicate<Student> gradeLevelPredicate = student -> student.getGradeLevel() >= 3;
	static Function<List<Student>, Map<String, List<String>>> nameAndActivities = students -> {
		Map<String, List<String>> name = new HashMap();
		students.forEach(student -> {
			if (gradeLevelPredicate.test(student)) {
				name.put(student.getName(), student.getActivities());
			}
		});
		return name;

	};

	public static void main(String[] args) {
	System.out.println(nameAndActivities.apply(students));	

	}

}
