package calcIdadeMasterOne;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = GregorianCalendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		Scanner in = new Scanner(System.in);
		System.out.println("Qual ano você nasceu?");
		int anoNasc = in.nextInt();
		System.out.println("Você tem: " + (anoAtual - anoNasc) + "anos.");
	}

}
