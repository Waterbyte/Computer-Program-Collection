import java.io.*;
import java.util.*;
public class MAXDIFF
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String inp[]=br.readLine().split(" ");
int n=Integer.parseInt(inp[0]);
int k=Integer.parseInt(inp[1]);

String inp2[]=br.readLine().split(" ");
int num[]=new int[n];
for(int i=0;i<n;i++)
{
num[i]=Integer.parseInt(inp2[i]);
}
Arrays.sort(num);

int sum1=0,sum2=0,value1=0,value2=0;

for(int i=0;i<n;i++)
{
if(i<k)
sum1+=num[i];
else
sum2+=num[i];
}
value1=Math.abs(sum1-sum2);


sum1=0;sum2=0;
for(int i=0;i<n;i++)
{
if(i<(n-k))
sum1+=num[i];
else
sum2+=num[i];
}
value2=Math.abs(sum1-sum2);

System.out.println(Math.max(value1,value2));

}




}
}