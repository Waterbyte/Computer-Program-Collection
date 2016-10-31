import java.io.*;
import java.util.*;
class ABA12C
{
public static int[] Ar;

public static int check(int k,int[] data)
{
int min_val=999999999;




if(k<=0) 
return 0;

if(Ar[k-1]>0)
{
	return Ar[k-1];
}
	else
		for(int i=0;i<k;i++)
{
	if(data[i]>0)
		min_val=Math.min(min_val,data[i]+check(k-i-1,data));
}
Ar[k-1]=min_val;
return Ar[k-1];
}





public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String []inp=br.readLine().split(" ");

int n=Integer.parseInt(inp[0]);
int k=Integer.parseInt(inp[1]);

String []inp2=br.readLine().split(" ");
int data[]=new int[k];
for(int i=0;i<k;i++)
{
data[i]=Integer.parseInt(inp2[i]);
}

Ar=new int[k];
int value=check(k,data);
if(value==0)
	System.out.println("-1");
else
	System.out.println(value);

System.out.println(Arrays.toString(Ar));
}



}
}