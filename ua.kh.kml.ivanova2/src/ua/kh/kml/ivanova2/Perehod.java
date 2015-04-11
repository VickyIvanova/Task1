package ua.kh.kml.ivanova2;
import java.util.Scanner;
import java.util.Random;
public class Perehod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner scan = new Scanner(System.in);
n = scan.nextInt();
Random r = new Random();
System.out.println("S_novoi_stroki? ");
String o;
o = scan.next();
if (o.equals("Y"))
{
	for (int i = 0; i<=n; i++)		
	System.out.println(r.nextInt(20)+" ");}
else if (o.equals("N"))
	{for (int i = 0; i<=n; i++)	
	System.out.print(r.nextInt(20)+" ");}
	}

}
