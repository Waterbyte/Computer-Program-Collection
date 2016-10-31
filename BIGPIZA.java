import java.io.*;
import java.util.*;
class BIGPIZA
{
static boolean Ar[]=new boolean[10001];
static int Gr[]=new int[10001];

public static void precalculate()
{
for(int i=2;i<=10000;i++)
 {
 Arrays.fill(Ar,false);
   for(int j=0;j<=i-2;j++)
   {
      int xor=Gr[j]^Gr[i-2-j];
	  if(xor<10001)
	  Ar[xor]=true;
   }
   for(int j=0;j<10001;j++)
   {
   if(!Ar[j])
   {
   Gr[i]=j;
   break;
   }
   }
 }






}


public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
precalculate();
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int n=Integer.parseInt(br.readLine());
System.out.println(Gr[n]!=0?"Arjuna":"Bhima");
}
}
}