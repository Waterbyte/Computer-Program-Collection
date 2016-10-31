import java.io.*;
public class STONES
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String j=br.readLine();
String s=br.readLine();
int len1=j.length();


char[] stones=s.toCharArray();
int len2=s.length();

int count=0;


for(int i=0;i<len1;i++)
{
char c=j.charAt(i);
for(int x=0;x<len2;x++)
{
if(c==stones[x])
stones[x]=' ';
}
}

for(int x=0;x<len2;x++)
{
if(stones[x]==' ')
count+=1;
}

System.out.println(count);


}


}
}