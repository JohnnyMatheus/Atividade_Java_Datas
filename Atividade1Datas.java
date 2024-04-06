package entregargit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*1 - Construir um programa para mostrar a data do sistema escrita por extenso usando
 *  as classes discutidas e testando as demais formas, como por exemplo: 
	Hoje é quinta-feira, dia 04 de abril de 2024 e agora são 20 horas e 32 minutos.
	Deve ser construída uma classe e um método para retornar a data nesse formato.
*/
public class Atividade1Datas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatasHoras1();
		System.out.println();
		DatasHoras2();
	}

	public static void DatasHoras1() {
		Locale.setDefault(new Locale("pt", "BR"));
		Calendar calendario = Calendar.getInstance();
		int diaSemana = calendario.get(Calendar.WEEK_OF_MONTH);
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		int mes = calendario.get(Calendar.MONTH);
		mes++;
		diaSemana++;
		int ano = calendario.get(Calendar.YEAR);
		int hora = calendario.get(Calendar.HOUR_OF_DAY);
		int minutos = calendario.get(Calendar.MINUTE);
		System.out.printf("Hoje é %d, dia %d do %d de %d e agora são %d horas e %d minutos", diaSemana, dia, mes, ano,
				hora, minutos);
	}

	public static void DatasHoras2() {
		DateFormat dataFull = DateFormat.getDateInstance(DateFormat.FULL);
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/y HH:mm:ss");
		SimpleDateFormat hora = new SimpleDateFormat("HH");
		SimpleDateFormat min = new SimpleDateFormat("m");
		Date data1 = new Date();
		System.out.println("Hoje é " + dataFull.format(data1) + " e agora são: " + hora.format(data1) + " e "
				+ min.format(data1) + " minutos");
		System.out.println("Data formato Simples 2 = " + sdf2.format(data1));
	}
}
