package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class ListsTest {

	public static void main(String[] args) {
		String class1 = "Knowing more about lists";
		String class2 = "Modeling the Class class";
		String class3 = "Working with sets";
		
		ArrayList<String> classes = new ArrayList<>();
		classes.add(class1);
		classes.add(class2);
		classes.add(class3);
		classes.add("Adding our knowledge");
		
		
		// ArrayList: toString
		System.out.println(classes);
		
//		classes.remove(0);
//		System.out.println(classes);
		
		for (String classLopp : classes) {
			System.out.println("Class with foreach: "+ classLopp);
		}
		
		System.out.println("------------------------------------------------");
		
		for (int i = 0; i < classes.size(); i++) {
			System.out.println("Class with get: "+ classes.get(i));
		}
		
		classes.forEach(course -> {
			System.out.println("Running: " + course);
		});
		
		Collections.sort(classes);
		
		System.out.println("After sort...");
		System.out.println(classes);
		
	}

}
