import java.io.*;
 class LUCKYSTR
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String inp[]=br.readLine().split(" ");

int k=Integer.parseInt(inp[0]);
int n=Integer.parseInt(inp[1]);

String[] fav_Data=new String[k];
for(int i=0;i<k;i++)
{
fav_Data[i]=br.readLine();
}

while(n-->0)
{
String s=br.readLine();

boolean flag=false;
for(int i=0;i<k;i++)
{
if(s.contains(fav_Data[i]))
flag=true;
}

if(flag==true||s.length()>=47)
System.out.println("Good");
else
System.out.println("Bad");




}


}


}