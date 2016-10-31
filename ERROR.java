import java.io.*;
import java.util.*;
public class ERROR
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String s=br.readLine();
if(s.contains("010")||s.contains("101"))
System.out.println("Good");
else
System.out.println("Bad");





}




}
}