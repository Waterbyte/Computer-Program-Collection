import java.io.*;
import java.util.*;
class ANUBTG
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n=Integer.parseInt(br.readLine());
			String[] line=br.readLine().split(" ");
			int Ar[]=new int[n];
			for(int i=0;i<n;i++)
				Ar[i]=Integer.parseInt(line[i]);
			
			Arrays.sort(Ar);
			int value=0;
			for(int i=n-1;i>=0;i=i-2)
			{
				if(i>=0)
					value+=Ar[i];
				i--;
				if(i>=0)
					value+=Ar[i];
				i--;
				
			}
			System.out.println(value);
		}
		
	}
	
	
}