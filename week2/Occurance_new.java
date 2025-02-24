import java.util.Arrays;
import java.util.Scanner;

public class Occurance_new {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,secondmax = 0,m = 0;
		System.out.println("Enter size of array - ");
		n = sc.nextInt();
		int arr[] = new int[n];
		boolean visited[] = new boolean[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
			if(i == 0)
			{
				m = arr[i];
				secondmax = m;
			}
			else
			{
				if(m < arr[i])
				{
					secondmax = m;
					m = arr[i];
				}
			}
		}
		Arrays.fill(visited,false);
		for(int i = 0; i < n; i++)
		{
			if(!visited[i])
			{
				int c = 1;
				for(int j = i+1; j < n; j++)
				{
					if(arr[i] == arr[j])
					{
						visited[j] = true;
						c += 1;
					}
				}
				System.out.println("Frequency of " + arr[i] +" is " + c);
			}
		}
		System.out.println("Second maximum element is - "+ secondmax);
	}

}
