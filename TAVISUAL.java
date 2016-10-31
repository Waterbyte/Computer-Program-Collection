import java.io.*;
class TAVISUAL
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String data[]=br.readLine().split(" ");
int n=Integer.parseInt(data[0]);
int c=Integer.parseInt(data[1]);
int q=Integer.parseInt(data[2]);

for(int i=0;i<q;i++)
{
String data2[]=br.readLine().split(" ");
int a=Integer.parseInt(data2[0]);
int b=Integer.parseInt(data2[1]);

int offset=c-a;
if(offset>=0&&c<=b)
{
c=b-offset;
}
}
System.out.println(c);

}

}
}