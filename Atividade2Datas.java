package entregargit;

import java.time.LocalDate;
import java.time.Period;

/*2 - Construir um método estático que deve ter a seguinte assinatura:
	public static void contaTempo(int dia, int mês, int ano)
	O método deve receber como parâmetro três inteiros representando dia, mês ano. 
	O método deve calcular e mostrar quanto tempo falta para que essa data aconteça, 
	contando a partir da data atual do sistema.

 * 
 */
public class Atividade2Datas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contaTempo(04, 01, 2026);
	}

	public static void contaTempo(int dia, int mes, int ano) {
		LocalDate agora = LocalDate.now();
		LocalDate segundaData = LocalDate.of(ano, mes, dia);
		Period periodo = Period.between(agora, segundaData);
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();

		System.out.println("Falta " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e "
				+ periodo.getDays() + " dias.");

	}

}
