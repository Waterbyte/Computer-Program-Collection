import java.io.*;
class NOCODING
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{

String s=br.readLine();
int len=s.length();

int value=0,offset=0,base=0;
for(int i=0;i<len;i++)
{
char c=s.charAt(i);
if(i==0)
{
base=(int)c;
}
else
{
offset=(int)c-base;
base=(int)c;
if(offset>=0)
value+=offset;
else
value=value+(26+offset);

}
}

if((value+len+1)>(len*11))
System.out.println("NO");
else
System.out.println("YES");




}

}

}