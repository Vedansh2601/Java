import java.util.Arrays;
import java.util.Scanner;
public class Subarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, maxsum = 0,newsum = 0, endindex = 0,startindex = 0;
		System.out.println("Enter size of array - ");
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int subarr[];
		for(int i = 0; i < n; i++)
		{
			newsum = 0;
			for(int j = i; j < n; j++)
			{
				newsum += arr[j];
				if(newsum > maxsum)
				{
					maxsum = newsum;
					endindex = j;
					startindex = i;
				}
			}
		}
		System.out.println("maxsum - "+maxsum+endindex);
		int subarray[] = Arrays.copyOfRange(arr, startindex, endindex+1);
		System.out.println(Arrays.toString(subarray));
	}

}
