import java.io.*;
import java.util.*;
public class NAME2
{

public static boolean check(String a,String b)
{
int alen=a.length();
int blen=b.length();
boolean flag=false;

int j=0;
for(int i=0;i<alen;i++)
{
char ac=a.charAt(i);
if(j==blen&&i<alen)
{
flag=true;
break;
}
while(j<blen)
{
char bc=b.charAt(j);
j++;

if(ac==bc)
break;


}
}

if(flag)
return false;
else
return true;



}




public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String[] data=br.readLine().split(" ");

if(data[0].length()>data[1].length())
{
if(check(data[1],data[0]))
System.out.println("YES");
else
System.out.println("NO");
}
else
{
if(check(data[0],data[1]))
System.out.println("YES");
else
System.out.println("NO");
}

}
}
}