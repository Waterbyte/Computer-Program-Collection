import java.io.*;
import java.math.*;
import java.util.*;
public class DRAGNXOR
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String[] inp=br.readLine().split(" ");
int n=Integer.parseInt(inp[0]);
int a=Integer.parseInt(inp[1]);
int b=Integer.parseInt(inp[2]);

int i=1;    int Ar[]=new int[n];          //creating binary of a
while(a>0)
{
Ar[n-i]=a%2;
a/=2;
i++;
}

 i=1;    int Ar2[]=new int[n];            //creating binary of b
while(b>0)
{
Ar2[n-i]=b%2;
b/=2;
i++;
}

int num1a=0;
int num0a=0;
int num1b=0;
int num0b=0;

for( i=0;i<n;i++)                         //value of num1a and num1b;
{
if(Ar[i]==1)
num1a+=1;
if(Ar2[i]==1)
num1b+=1;
}
num0a=n-num1a;
num0b=n-num1b;

int total1=Math.min(num1a,num0b)+Math.min(num1b,num0a);

int value=0;
for(i=n-1;i>=n-total1;i--)
{
value+=Math.pow(2,i);
}
System.out.println(value);

}
}
}



