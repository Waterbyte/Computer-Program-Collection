import java.io.*;
import java.util.*;
class WorldCup
{
static int TLIMIT=25000;
static int RLIMIT=1800;
static int BLIMIT=300;
static int LLIMIT=9;
static int MOD=1000000007;
static int[][]C=new int[BLIMIT+10][BLIMIT+10];

public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


for(int i=0;i<=BLIMIT;i++)
      for(int j=0;j<=i;j++)
	     {
		 if(j==0||j==i)C[i][j]=1;
		 else
		 C[i][j]=(C[i-1][j-1]+C[i-1][j])%MOD;
		 }

		 int t;
		 t=Integer.parseInt(br.readLine());
		 while(t-->0)
		 {
		 String[] data=br.readLine().split(" ");
		 int r,b,l;
		 r=Integer.parseInt(data[0]);
		 b=Integer.parseInt(data[1]);
		 l=Integer.parseInt(data[2]);
		 
		 long ways=0;
		 for(int six=0;six*6<=r&&six<=b;six++)
		 {
		     int other=r-six*6;
			 if(other%4==0)
			 {
			 int four=other/4;
			 for(int wicket=0;wicket<=l;wicket++)
			 {
			    if(six+four+wicket<=b)
				{
				long cur=C[b][six];
				cur=(cur*C[b-six][four])%MOD;
				cur=(cur*C[b-six-four][wicket])%MOD;
				ways+=cur;
				}
			 }
		 ways%=MOD;
		 }
	 
		 }
System.out.println(ways);	
}
}
}