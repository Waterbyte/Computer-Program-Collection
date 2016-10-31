import java.io.*;
public class DECSTR
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{

int num=Integer.parseInt(br.readLine());
String s="";
int round=num/25;
num=num%25;
if(num==0)
	num=-1;

while(round>=0)
{
	round--;
	for(int i=97+num;i>=97;i--)
	{
	s=s+(char)i;	
	}
	num=25;
}
System.out.println(s);








}

}
}