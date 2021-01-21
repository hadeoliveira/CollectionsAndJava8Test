package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class PerformanceTest {
	public static void main(String[] args) {
//		Collection<Integer> numbers = new ArrayList<>();		
		Collection<Integer> numbers = new HashSet<>();
		long begin = System.currentTimeMillis();
		
		for(int i=1; i <= 100000; i++) {
			numbers.add(i);
		}
		for (Integer number : numbers) {
			numbers.contains(number);
		}
		long end = System.currentTimeMillis();
		
		long executionTime = end-begin;
		System.out.println("Execution time: "+ executionTime);
	}
}
