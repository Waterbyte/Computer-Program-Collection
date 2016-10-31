import java.io.*;
import java.math.*;
public class AMSGAME1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int n=Integer.parseInt(br.readLine());
String s[]=br.readLine().split(" ");

BigInteger f,sec,val;

f=new BigInteger(s[0]);
sec=new BigInteger(s[1]);
val=f.gcd(sec);

for(int i=2;i<n;i++)
{
sec=new BigInteger(s[i]);
val=val.gcd(sec);
}
System.out.println(val);

}

}
}