import java.io.*;
import java.util.*;
class DISHOWN
{

public static int find(int i,int[] Ar)
{
int j;
if(Ar[i]==i)
return i;
else
{
j=find(Ar[i],Ar);
Ar[i]=j;
return j;
}
}


public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int n=Integer.parseInt(br.readLine());
String[] data=br.readLine().split(" ");
int S[]=new int[n+1];
for(int i=1;i<=n;i++)
S[i]=Integer.parseInt(data[i-1]);

int Ar[]=new int[n+1];
for(int i=1;i<=n;i++)
Ar[i]=i;

int q=Integer.parseInt(br.readLine());
while(q-->0)
{
String[] line=br.readLine().split(" ");
if(line.length==3)
{
int one=Integer.parseInt(line[1]);
int two=Integer.parseInt(line[2]);

one=find(one,Ar);
two=find(two,Ar);

if(one==two)
System.out.println("Invalid query!");
else
{
if(S[one]>S[two])
Ar[two]=Ar[one];
else if(S[one]<S[two])
Ar[one]=Ar[two];
}
}
else
{
int own=Integer.parseInt(line[1]);
own=find(own,Ar);
System.out.println(own);
}


}

}
}
}