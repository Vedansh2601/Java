import java.util.*;
abstract class Temperature
{
	double temp;
	void setTempdata(double t)
	{
		temp = t;
	}
	abstract void changetemp();
}
class Fahrenheit extends Temperature
{
	double ctemp;
	void changetemp()
	{
		ctemp = (5.0/9.0)*(double)(temp-32);
		System.out.println("Tempreature in celcius - " + ctemp);
	}
}
class Celcius extends Temperature
{
	double ftemp;
	void changetemp()
	{
		ftemp = (double)(9.0/5)*(double)(temp+32);
		System.out.println("Tempreature in fahrenheit - " + ftemp);
	}
}
public class Abtemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to input in f\nEnter 2 to input in c");
		int c = sc.nextInt();
		Temperature ob;
		if(c == 1)
		{
			ob = new Fahrenheit();
		}
		else
		{
			ob = new Celcius();
		}
		System.out.println("Enter temperature - ");
		double temp = sc.nextInt();
		ob.setTempdata(temp);
		ob.changetemp();

	}

}
