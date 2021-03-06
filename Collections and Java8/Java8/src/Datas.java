import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
//		System.out.println(hoje);
		
		LocalDateTime agora = LocalDateTime.now();
//		System.out.println("agora em data atual e agora:  " + 
//				agora.toLocalDate() + " " + agora);
		
		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
		
		int anos = olimpiadasRio.getYear() - agora.getYear();
//		System.out.println(anos);
		
		
		Period periodo = Period.between(olimpiadasRio, hoje);
//		System.out.println(periodo.getYears());
//		System.out.println(periodo.getMonths());
//		System.out.println(periodo.getDays());
	
		LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);
		Period periodoDataCriada = Period.between(hoje, data);
		System.out.println(periodoDataCriada);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = data.format(formatador);
		System.out.println(dataFormatada);
	}
}
