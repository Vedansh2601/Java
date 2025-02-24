import java.util.Scanner;
public class FriendlyPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,t1,t2,s1=0,s2=0;
		System.out.println("Enter 2 numbers - ");
		a = sc.nextInt();
		b = sc.nextInt();
		t1=a;
		t2=b;
		for(int i = 1; i <= a; i++)
		{
			if(a%i == 0)
				s1 += i;
		}
		for(int i = 1; i <= b; i++)
		{
			if(b%i == 0)
				s2 += i;
		}
		if(s1/a == s2/b)
			System.out.println("Friendly pair\n");
		else
			System.out.println("Not Firendly pair");
	}

}
