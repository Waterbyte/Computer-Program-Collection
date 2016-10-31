import java.io.*;
import java.util.*;
class ICPC16B
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int n=Integer.parseInt(br.readLine());
int Ar[]=new int[n];
String[] line=br.readLine().split(" ");
int flag=0; int negative=0;
HashSet<Integer> set=new HashSet<Integer>();

for(int i=0;i<n;i++)
{
Ar[i]=Integer.parseInt(line[i]);
set.add(Ar[i]);
if(Ar[i]<-1||Ar[i]>1)
flag+=1;

if(Ar[i]==-1)
negative+=1;

}

if(flag>1)
System.out.println("no");
else if(negative>0&&flag==1)
System.out.println("no");
else if(negative>1&&!set.contains(1))
{
System.out.println("no");
}
else
System.out.println("yes");
}

}
}