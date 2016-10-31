import java.io.*;
public class GCD2
{
public static int gcd(int a,int b)

{
if(b==0)
return a;
else
return gcd(b,a%b);

}


public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());

while(n-->0)
{

String[] inp=br.readLine().split(" ");
int a=Integer.parseInt(inp[0]);
String b=inp[1];
int len=b.length();

int minimized_Value=0;
for(int i=0;i<len;i++)
{
char c=b.charAt(i);
int num=10*minimized_Value+Integer.parseInt(c+"");
minimized_Value=num%c;


}

System.out.println(gcd(a,minimized_Value));



}
}
}