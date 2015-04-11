package ua.kh.kml.ivanova2;

import java.util.Scanner;

public class Zadanie_6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		int mas[] = new int[n];
		for (int i = 0; i<n; i++)
		mas[i] = scan.nextInt();

		for (int i = 0; i<n; i++)
			if(mas[i]%5==0 && mas[i]%7==0)
				System.out.println("Делится на 5 и на 7 " + mas[i]);
			else System.out.println("Таких чисел нет");
	}

}
