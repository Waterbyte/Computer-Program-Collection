import java.io.*;
class SALARY
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int n=Integer.parseInt(br.readLine());
String inp[]=br.readLine().split(" ");
int Ar[]=new int[n];

int min=999999999;
for(int i=0;i<n;i++)
{
Ar[i]=Integer.parseInt(inp[i]);
if(Ar[i]<min)
{
min=Ar[i];
}
}

int value=0;
for(int i=0;i<n;i++)
{
if(Ar[i]!=min)
{
value+=Ar[i]-min;
}
}
System.out.println(value);
}
}
}