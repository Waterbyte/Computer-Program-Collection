import java.io.*;
public class CLEANUP
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String[] s=br.readLine().split(" ");
int n=Integer.parseInt(s[0]);
int m=Integer.parseInt(s[1]);

int Ar[]=new int[n];

String[] s2=br.readLine().split(" ");
for(int i=0;i<m;i++)
{
int x=Integer.parseInt(s2[i]);
Ar[x-1]=1;
}

String val1="";
String val2="";

boolean flag1=true;
for(int i=0;i<n;i++)
{
if(Ar[i]!=1)
{
if(flag1==true)
{
val1=val1+(i+1)+" ";
flag1=false;
}
else
{
val2=val2+(i+1)+" ";
flag1=true;
}
}
}
System.out.println(val1);
System.out.println(val2);


}



}
}