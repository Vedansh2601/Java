import java.util.Scanner;
public class Bankdeposit 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int c,p,r,t;
		float a=0.0f;
		System.out.println("Enter 1 for Term Deposit\nEnter 2 for Recurring Deposit\nEnter - ");
		c = sc.nextInt();
		switch(c)
		{
		case 1:
			System.out.println("Enter Principal - ");
			p = sc.nextInt();
			System.out.println("Enter Rate of Interest - ");
			r = sc.nextInt();
			System.out.println("Enter Time Period in years - ");
			t = sc.nextInt();
			a = ((float)((p*r*t)*1.0)/100);
			System.out.println("Maturity Amount receivable = "+a);
			break;
		case 2:
			System.out.println("Enter Monthly installment - ");
			p = sc.nextInt();
			System.out.println("Enter Rate of Interest - ");
			r = sc.nextInt();
			System.out.println("Enter Time Period in years - ");
			t = sc.nextInt();
			a = (float)((p * t) + p * (t*(t + 1) / 2) * (r / 100) * (1 / 12));
			System.out.println("Maturity Amount receivable = "+a);
			break;
		default:
			System.out.println("Invalid Choice!!");
		}
	}
}
