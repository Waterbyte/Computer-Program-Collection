import java.io.*;
import java.util.*;
public class HORSES
{
public static void main(String args[])throws IOException
{
	InputStreamReader sys=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(sys);
	
int t=Integer.parseInt(br.readLine());

while(t-->0)
{
int num=Integer.parseInt(br.readLine());
int Ar[]=new int[num];


String[] inp=br.readLine().split(" ");
for(int i=0;i<num;i++)
{
	Ar[i]=Integer.parseInt(inp[i]);
}


Arrays.sort(Ar);
int min=999999999;
for(int i=0;i<num-1;i++)
{
if(Math.abs(Ar[i]-Ar[i+1])<min)
{
min=Math.abs(Ar[i]-Ar[i+1]);
}
}

System.out.println(min);


}

}
}