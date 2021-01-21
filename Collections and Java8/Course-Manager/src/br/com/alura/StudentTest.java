package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StudentTest {
	public static void main(String[] args) {
		Set<String> students = new HashSet<>();
		students.add("Henrique Augusto");
		students.add("Jucineide Oliveira");
		students.add("Geraldo Oliveira");
		students.add("Felipe Guilherme");
		students.add("Marina Baeza");
		students.add("Henrique Augusto");
		
		System.out.println(students);
		System.out.println("----------------------------------------------");
		
		
		System.out.println("Using foreach...");
		for (String student : students) {
			System.out.println(student);
		}
		System.out.println("The set size is: "+ students.size());
		System.out.println("----------------------------------------------");
		
//		Set<String> emptySet = Collections.emptySet();
//		emptySet.add("Teste de incluir vazio");
		
		Set<String> studentsSyncronized = Collections.synchronizedSet(students);
		System.out.println(studentsSyncronized);
	}
}
