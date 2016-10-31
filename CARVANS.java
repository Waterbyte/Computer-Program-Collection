import java.io.*;
public class CARVANS
{
public static void main(String args[])throws IOException
{
InputStreamReader system=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(system);
		
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
		int n=Integer.parseInt(br.readLine());		
		int Ar[]=new int[n];
		String[] inp=br.readLine().split(" ");
		
		for(int i=0;i<n;i++)
		{
		Ar[i]=Integer.parseInt(inp[i]);
		}
		
		int min=Ar[0],total=0;
		for(int i=0;i<n;i++)
		{
		if(Ar[i]<=min)
		{
		min=Ar[i];
		total+=1;
		}
		}
		
		System.out.println(total);
		}
}
}