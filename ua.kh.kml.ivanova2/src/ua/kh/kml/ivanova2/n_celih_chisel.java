package ua.kh.kml.ivanova2;
import java.util.Scanner;

public class n_celih_chisel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		int mas[] = new int[n];
		for (int i = 0; i<=n-1; i++)
		mas[i] = scan.nextInt();

		for (int i = 0; i<=n-1; i++)
			if(mas[i]%2==0)
				System.out.println(mas[i] + " четное");
			else System.out.println(mas[i] + " нечетное");
	}

}
