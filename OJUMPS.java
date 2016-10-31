import java.io.*;
import java.math.*;
public class OJUMPS
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
BigInteger num=new BigInteger(br.readLine());


BigInteger zero=new BigInteger("0");
BigInteger one =new BigInteger("1");
BigInteger three=new BigInteger("3");
BigInteger six=new BigInteger("6");

boolean flag=false;

if(num.mod(six).equals(zero))
flag=true;
if((num.subtract(one)).mod(six).equals(zero))
flag=true;
if((num.subtract(three)).mod(six).equals(zero))
flag=true;

if(flag)
System.out.println("yes");
else
System.out.println("no");

}
}
