package ua.kh.kml.ivanova2;

import java.util.Scanner;

public class naibolshee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int mas[] = new int[n];
		for (int i = 0; i<n; i++)
		mas[i] = scan.nextInt();
		int max = mas[0];
		int min = mas[0];
		for (int i = 0; i<n; i++)
			{
			if(mas[i] > max)
				max = mas[i];
		    if(mas[i] < min)
	        	min = mas[i];
			}
		System.out.println("max " + max + " min " + min);
	}

}
