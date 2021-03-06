import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("Alura online");
		palavras.add("Editora Casa do C�digo");
		palavras.add("Caelum");
		
		palavras.sort((string1, string2) -> {
				
				if (string1.length() < string2.length())
					return -1;

				if (string1.length() > string2.length())
					return 1;

				return 0;
		});
		
		palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
		palavras.forEach(System.out :: println);
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		System.out.println(palavras);

		/*
		 * for(String p : palavras) { System.out.println(p); }
		 */

		palavras.forEach(t -> System.out.println(t));
	}
}
