package questao01;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma data no formato (yyyy-MM-dd)");
		String aux = sc.next();
		
		LocalDate data = LocalDate.parse(aux);	
		LocalDate data2 = LocalDate.now();
		System.out.println("Quantidade de dias até a tada de hoje: "+data.until(data2, ChronoUnit.DAYS));
		System.out.println("Data digitada + 110 dias: "+data.plusDays(110));
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		System.out.println("Data formatada: "+formatador.format(data.withMonth(8)));
		//long m = calcularDias(data, data2);
		//System.out.println(m);
		
		System.out.println("Digite duas datas no formato (yyyy-MM-dd)");
		String aux2 = sc.next();
		String aux3 = sc.next();
		LocalDate data3 = LocalDate.parse(aux2);
		LocalDate data4 = LocalDate.parse(aux3);
		long m = calcularDiasUteis(data3, data4);
		System.out.println("Dias úteis entre essas datas= " + m);
	
		
		sc.close();

	}
	
	public static long calcularDiasUteis (LocalDate data1, LocalDate data2) {
		long n = data1.until(data2, ChronoUnit.DAYS);
		long m=0;
		for (long i=1; i<=n; i++) {
			LocalDate date3 = data1.plusDays(i);
			if(!date3.getDayOfWeek().equals(DayOfWeek.SATURDAY) && !date3.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
				m +=1;
			}
		}
		
		return m;
	}
}
