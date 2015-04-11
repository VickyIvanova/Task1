package ua.kh.kml.ivanova2;

public class Suma_i_pproizvedeniya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=args.length-1;i>=0;i--)
			System.out.println(args[i]);
		int sum=0, proizved=1;
		for(int i=args.length-1;i>=0;i--)
		{
			sum=sum+Integer.parseInt(args[i]);
			proizved=proizved*Integer.parseInt(args[i]);
		}
			System.out.println("sum " + sum + "; proizved " + proizved);
		
	}

}
