import java.io.*;
public class ANUDTC
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int num=Integer.parseInt(br.readLine());
if(360%num==0&&num<=360)
System.out.print("y ");
else
System.out.print("n ");

if(num<=360)
System.out.print("y ");
else
System.out.print("n ");

if(num<=26)
System.out.print("y ");
else
System.out.print("n ");


}




}
}