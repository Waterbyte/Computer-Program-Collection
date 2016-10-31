import java.io.*;
import java.util.*;
class ICPC16D
{
public static long value=0;

public static void calculate(int[] Ar,int index,int n,int ele)
{
if(index==n)
{
return;
}
System.out.println(Ar[index]+"   "+index+"    "+ele);
if(Ar[index]%ele==0)
{
value=(value+1)%1000000007;

}
else
return;
if((index+1)<n)
{
calculate(Ar,index+1,n,ele);
calculate(Ar,index+1,n,Ar[index+1]);
}

}
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int n=Integer.parseInt(br.readLine());
String[] line=br.readLine().split(" ");
int[] Ar=new int[n];
for(int i=0;i<n;i++)
{
Ar[i]=Integer.parseInt(line[i]);
}

Arrays.sort(Ar);


calculate(Ar,0,n,Ar[0]);

System.out.println(value);
}
}
}