import java.util.*;
class Employee
{
	int id,did;
	String name;
	void getdata()
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.printf("Enter Name - ");
			name = sc.nextLine();
			if(!Character.isUpperCase(name.charAt(0)))
			{
				throw new Exception("Should begin with capital letter");
			}
			System.out.printf("Enter id - ");
			id = sc.nextInt();
			if(!(2001 <= id && id <= 5001))
			{
				throw new Exception("Should lie in range (2001 - 5001)");
			}
			System.out.printf("Enter Department id - ");
			did = sc.nextInt();
			if(!(1<= did && did <= 5))
			{
				throw new Exception("Should lie in range (1-5)");
			}
			System.out.println("Name : "+name);
			System.out.println("Employee id : "+id);
			System.out.println("Department id : "+did);
		}
		catch(Exception e)
		{
			System.out.println("Error - " + e.getMessage());
		}
	}
}
public class Eclass {

	public static void main(String[] args) {
		Employee ob = new Employee();
		ob.getdata();

	}

}
