import java.io.*;
import java.util.*;
public class LAPIN
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String ss=br.readLine();
String s="";
int len=ss.length();
ArrayList arrayList=new ArrayList();

if(len%2!=0)
{
int mid=len/2;
String a=ss.substring(0,mid);
String b=ss.substring(mid+1,len);
s=a+b;
len-=1;
}
else
{
s=ss;
}


char[] Ar=new char[len/2];
for(int i=0;i<len/2;i++)
{
Ar[i]=s.charAt(i);
}

for(int i=len/2;i<len;i++)
{
char c=s.charAt(i);
for(int j=0;j<len/2;j++)
{
if(c==Ar[j])
{
Ar[j]=' ';
break;
}
}
}

int count=0;
for(int i=0;i<len/2;i++)
{
if(Ar[i]==' ')
count+=1;
}

if(count==len/2)
System.out.println("YES");
else
System.out.println("NO");


}
}
}