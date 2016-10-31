import java.io.*;
import java.math.*;
class RRSUM
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String data[]=br.readLine().split(" ");
long n=Long.parseLong(data[0]);
int m=Integer.parseInt(data[1]);
for(int i=0;i<m;i++)
{
int num=Integer.parseInt(br.readLine());

long count=n;
if(num>n&&n<=3*n)
{

long gold=2*n+1;
long offset=Math.abs(num-gold);
count=count-offset;

System.out.println(count);
}
else
{
System.out.println("0");
}



}

}
}