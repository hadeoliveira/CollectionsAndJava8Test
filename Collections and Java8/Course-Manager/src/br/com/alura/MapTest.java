package br.com.alura;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
        
		Map<String, Integer> nomesParaIdade = new HashMap<>();
        
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
        System.out.println("Key Set: ");
        nomesParaIdade.keySet().forEach(name -> System.out.println(name));
        System.out.println("-------------------------------------------");
        
        System.out.println("Collection of values: ");
        nomesParaIdade.values().forEach(age -> System.out.println(age));
        System.out.println("-------------------------------------------");
        
        Set<Entry<String,Integer>> associacoes = nomesParaIdade.entrySet();
        System.out.println("Collection of key - values: ");
        for(Entry<String,Integer> associacao : associacoes) {
        	System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
	}

}
