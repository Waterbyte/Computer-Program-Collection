import java.io.*;
 class MARCHA2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int n=Integer.parseInt(br.readLine());
String in[]=br.readLine().split(" ");
int[] Ar=new int[n];

for(int i=0;i<n;i++)
Ar[i]=Integer.parseInt(in[i]);

double total=0.5;
for(int i=0;i<n;i++)
{

total=2*total;
total=total-Ar[i];

if(total==0&&i==(n-1))
{
System.out.println("Yes");
break;
}
else if((i==n-1)||(total<0))
{
System.out.println("No");
break;
}


}
}
}
}