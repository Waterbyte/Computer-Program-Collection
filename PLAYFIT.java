import java.io.*;
import java.util.*;
class PLAYFIT
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int n=Integer.parseInt(br.readLine());
String s[]=br.readLine().split(" ");
int[] Ar=new int[n];
for(int i=0;i<n;i++)
Ar[i]=Integer.parseInt(s[i]);

int A[]=new int[n];
int B[]=new int[n];

int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;
for(int i=n-1;i>=0;i--)
{
if(Ar[i]>max)
{
max=Ar[i];
B[i]=Ar[i];
}
else
B[i]=max;
}
for(int i=0;i<n;i++)
{
if(Ar[i]<min)
{
min=Ar[i];
A[i]=Ar[i];
}
else
{
A[i]=min;
}
}


int diff=0;
for(int i=0;i<n;i++)
{
diff=Math.max(diff,B[i]-A[i]);
}


if(diff==0)
System.out.println("UNFIT");
else
System.out.println(diff);

}
}
}