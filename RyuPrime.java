import java.io.*;
import java.util.*;
import java.math.*;
class RyuPrime
{
static boolean[] Ar=new boolean[1000001];

public static void precalculate()
{Ar[1]=true;
   for(int i=2;i<(int)Math.sqrt(1000001);i++)
    {
	 for(int j=i;j*i<1000001;j++)
	   {
			Ar[i*j]=true;
	   }
	
	}   
	

}




public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
precalculate();

while(t-->0)
{
String data[]=br.readLine().split(" ");
int num=Integer.parseInt(data[0]);
int itr=Integer.parseInt(data[1]);
String data2[]=br.readLine().split(" ");

long sum=0;
int k=0;
for(int i=0;i<data2.length;i++)
{
if(!Ar[Integer.parseInt(data2[i])])
{
k++;
}
if(k==itr)
{
sum=sum+Integer.parseInt(data2[i]);
k=0;
}

}
System.out.println(sum);
}
}
}