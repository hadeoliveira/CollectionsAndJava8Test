import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Curso de C", 45));
		cursos.add(new Curso("Curso de Java", 60));
		cursos.add(new Curso("Linux Descomplicado", 108));
		cursos.add(new Curso("Javascript Advanced", 100));
		
		cursos.sort(Comparator.comparing(Curso :: getAlunos));
//		cursos.forEach(curso -> System.out.println(curso.getNome()));
	
		int sum = cursos.stream()
				.filter(curso -> curso.getAlunos() >= 100)
				.mapToInt(Curso :: getAlunos)
				.sum();
		
		System.out.println(sum);
		
		Optional<Curso> optionalCurso = cursos.stream()
				.filter(c -> c.getAlunos() >= 1000)
				.findAny();
		
		optionalCurso.ifPresent( curso -> System.out.println(curso.getNome()));
		
		List<Curso> listaDeCurso = cursos.stream()
				.filter(curso -> curso.getAlunos() > 100)
				.collect(Collectors.toList());
		
		cursos.stream()
				.filter(curso -> curso.getAlunos() > 50)
				.collect(Collectors.toMap( 
									curso -> curso.getNome(),
									curso -> curso.getAlunos()))
				.forEach((nome,alunos) -> 
							System.out.println( nome + " tem " + alunos + " alunos"));
		
		
		System.out.println("-------------------------------------------------------");
		cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.findFirst()
				.ifPresent(curso -> System.out.println(curso.getNome()));

		
		
		System.out.println("-------------------------------------------------------");
		OptionalDouble average = cursos.stream()
					.mapToInt(Curso :: getAlunos)
					.average();
		System.out.println(average);
	}
}
