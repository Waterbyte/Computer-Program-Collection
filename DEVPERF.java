import java.io.*;
import java.util.*;
class DEVPERF
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String line1[]=br.readLine().split(" ");
int r=Integer.parseInt(line1[0]);
int c=Integer.parseInt(line1[1]);

char[][] Ar=new char[r][c];
int min_c,min_r,max_c,max_r;
min_c=99999999;
min_r=99999999;
max_c=-1;
max_r=-1;
int count=0;

for(int i=0;i<r;i++)
{
String line2=br.readLine();
for(int j=0;j<line2.length();j++)
{
Ar[i][j]=line2.charAt(j);
if(Ar[i][j]=='*')
{

if(i<min_r)
min_r=i;
if(j<min_c)
min_c=j;
if(i>max_r)
max_r=i;
if(j>max_c)
max_c=j;
count++;
}
}
}

int value=Math.max(max_c-min_c+1,max_r-min_r+1)/2+1;

if(count>0)
System.out.println(value);
else
System.out.println(0);




}
}
}