import java.io.*;
public class NUKES
{
public static void main(String args[])throws IOException
{
InputStreamReader system=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(system);

String[] inp=br.readLine().split(" ");
long a=Long.parseLong(inp[0]);
int n=Integer.parseInt(inp[1]);
int k=Integer.parseInt(inp[2]);

int output[]=new int[k];

for(int i=0;i<k;i++)
{
	output[i]=0;
}

for(int i=0;i<k;i++)
{
	output[i]=(int)(a%(n+1));
	a=a/(n+1);
}

for(int i=0;i<k;i++)
{
	System.out.print(output[i]+" ");
}


}
}