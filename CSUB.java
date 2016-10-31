import java.io.*;
import java.util.*;
class CSUB
{

static int value=0;
static void trys(String s,int n)
{
int count=0;
for(int i=0;i<n;i++)
if(s.charAt(i)=='1')
count++;

while(count>0)
{
value+=count;
count--;
}


}

public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
value=0;
int n=Integer.parseInt(br.readLine());
String s=br.readLine();
trys(s,n);
System.out.println(value);
}
}
}