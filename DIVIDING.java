import java.io.*;
import java.util.*;
public class DIVIDING
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
String s[]=br.readLine().split(" ");
int total=0;
int total2=0;
for(int i=0;i<n;i++)
{
total+=Integer.parseInt(s[i]);
total2+=i;
}
total2+=n;

if(total2==total)
System.out.println("YES");
else
System.out.println("NO");


}}
