import java.io.*;
import java.util.*;
import java.math.*;
public class SPCANDY
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
while(n-->0)
{
String s[]=br.readLine().split(" ");
String a="",b="";
int count=0;
for(int i=0;i<s.length;i++)
{
if(s[i].length()!=0)
{
if(count==0)
{
a=s[i];
count++;
}
else
{
b=s[i];
}
}
}

BigInteger b1,b2;
BigInteger[] b3;
BigInteger zero=new BigInteger("0");
b1=new BigInteger(a);
b2=new BigInteger(b);


if(b1==zero&&b2==zero)
{
System.out.println("0 0");
}

else if(b1.equals(zero))
{
System.out.println("0 "+0);
} 
else if(b2.equals(zero))
{
System.out.println("0 "+b1);
}
else
{
b3=b1.divideAndRemainder(b2);
System.out.println(b3[0]+" "+b3[1]);
}

}

}
}