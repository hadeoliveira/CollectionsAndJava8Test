package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import classes.Classes;

public class ClassTest {

	public static void main(String[] args) {
		Classes class1 = new Classes("OOP and Java", 50);
		Classes class2 = new Classes("Operating Systems - Linux", 100);
		Classes class3 = new Classes("Distributed Systems", 150);
		
		ArrayList<Classes> classes = new ArrayList<>();
		classes.add(class1);
		classes.add(class2);
		classes.add(class3);
		
		System.out.println(classes);
		
		Collections.sort(classes);
	
		System.out.println(classes);
	
		Collections.sort(classes, Comparator.comparing(Classes::getTime));
		
		System.out.println(classes);
		
		//it has same efect from 27 line
		classes.sort(Comparator.comparing(Classes::getTime));
	}
}