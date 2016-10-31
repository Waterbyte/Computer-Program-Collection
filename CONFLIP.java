import java.io.*;
import java.util.*;
public class CONFLIP
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader system=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(system);
		
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int g=Integer.parseInt(br.readLine());
			while(g-->0)
			{
				String[] inp=br.readLine().split(" ");
				int i=Integer.parseInt(inp[0]);
				long n=Long.parseLong(inp[1]);
				int q=Integer.parseInt(inp[2]);
				
				if(i==1)
				{
					if(n%2==0)
						System.out.println(n/2);
					else
					{
						if(q==1)
							System.out.println(n/2);
						else
							System.out.println((n/2)+1);
					}
					
				}
				else
				{
					if(n%2==0)
						System.out.println(n/2);
					else
					{
						if(q==1)
							System.out.println((n/2)+1);
						else
							System.out.println(n/2);
					}
				}
				
				
			}
			
			
			
		}
		
		
	}
	
}