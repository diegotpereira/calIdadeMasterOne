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
		System.out.println("Qual ano voc� nasceu?");
		int anoNasc = in.nextInt();
		System.out.println("Voc� tem: " + (anoAtual - anoNasc) + "anos.");
	}

}
