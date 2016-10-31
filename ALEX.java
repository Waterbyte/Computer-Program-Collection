import java.io.*;
import java.util.*;
class ALEX
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String num=br.readLine();
String data[]=br.readLine().split(" ");
int a=Integer.parseInt(data[0]);
int b=Integer.parseInt(data[1]);

long value=1;
for(int i=0;i<num.length();)
{
int itr=Integer.parseInt(num.charAt(i)+"");
String s="";
while(itr>0&&i<num.length())
{
s+=num.charAt(i);
i++;
itr--;
}
value=(value*Integer.parseInt(s))%(long)(Math.pow(10,a)+b);
}
System.out.println(value);

}

}
}