import java.util.Arrays;
import java.util.Scanner;

public class MaxOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, mf = 0,mfi = 0;
		System.out.println("Enter size of array - ");
		n = sc.nextInt();
		int arr[] = new int[n];
		boolean visited[] = new boolean[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
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
					}System.out.println("Frequency of " + arr[i] +" is " + c);
				}
				if(mf < c)
				{
					mf = c;
					mfi = i;
				}
			}
		}
		System.out.println("Maximum Frequency elements is " + arr[mfi] +" with frequency " + mf);
	}
}


