import java.util.*;
class Calculator
{
	void power(int n,int p)
	{
		try
		{
			if(!(n>=0 && p >=0))
			{
				throw new Exception("Should be positive");
			}
			System.out.println("Result: "+n*p);
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
}
public class Ecal
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,p;
		System.out.printf("Enter values of n and p - ");
		n = sc.nextInt();
		p = sc.nextInt();
		Calculator ob = new Calculator();
		ob.power(n, p);
	}
}
