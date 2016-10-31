import java.io.*;
public class BUYING2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String input1[]=br.readLine().split(" ");
int n=Integer.parseInt(input1[0]);
int x=Integer.parseInt(input1[1]);
String input2[]=br.readLine().split(" ");

int Ar[]=new int[n];

int total_Sum=0;         
int min=999999999;
for(int i=0;i<n;i++)
{
Ar[i]=Integer.parseInt(input2[i]);
total_Sum+=Ar[i];

if(Ar[i]<min)
{
min=Ar[i];
}

}
if(total_Sum/x==(total_Sum-min)/x)
{
System.out.println("-1");
}
else
{
System.out.println(total_Sum/x);
}

}
}
}
