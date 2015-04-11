package ua.kh.kml.ivanova2;

import java.util.Scanner;

public class Zadanie_6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		String m;
		String mas[] = new String[n];
		for (int i = 0; i<n; i++)
			{
			mas[i] = scan.nextLine();
			m = mas[i];
		    if(m.length()==4 && m.charAt(0) + m.charAt(1) == m.charAt(2) + m.charAt(3))
				System.out.println("—частливое число " + mas[i]);
	}
	}
}
