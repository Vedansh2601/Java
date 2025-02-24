import java.util.Arrays;
public class StringChar {
	public static void main(String[] args) {
		String str = "aaabbcbdaadd";
		boolean visited[] = new boolean[str.length()];
		Arrays.fill(visited,false);
		for(int i = 0; i < str.length(); i++)
		{
			if(!visited[i])
			{
				int c = 1;
				for(int j = i+1; j < str.length(); j++)
				{
					if(str.charAt(i) == str.charAt(j))
					{
						visited[j] = true;
						c += 1;
					}
				}
				System.out.println("Frequency of " + str.charAt(i) +" is " + c);
			}
		}
	}
}
