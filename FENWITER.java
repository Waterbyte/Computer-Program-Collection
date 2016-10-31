import java.io.*;
import java.util.*;
import java.math.*;
class FENWITER
{

public static void evaluate(BigInteger val)
{
int count=0;
BigInteger zero=new BigInteger("0");
while(val.compareTo(zero)>=0)
{
BigInteger one=new BigInteger("1");
BigInteger val2=val.add(one);
val=(val.and(val2)).subtract(one);
count+=1;
}

System.out.println(count);
}







public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String[] data=br.readLine().split(" ");
String l1=data[0];
String l2=data[1];
String l3=data[2];
int mul=Integer.parseInt(data[3]);

String templ2=l2;
while(mul>1)
{
l2=l2+templ2;
mul--;
}

String num=l1+l2+l3;

BigInteger numval=new BigInteger(num,2);
evaluate(numval);

}
}
}