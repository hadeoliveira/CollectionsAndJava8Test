package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class Exercise {

	public static void main(String[] args) {

        Map<Integer, String> people = new HashMap<>();

        people.put(21, "Leonardo Cordeiro");
        people.put(27, "Fabio Pimentel");
        people.put(19, "Silvio Mattos");
        people.put(23, "Romulo Henrique");
        
        for( Integer age : people.keySet()) {
        	System.out.println(age);
        }
	}

}
