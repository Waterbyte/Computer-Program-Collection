import java.io.*;
import java.util.*;
class SEALINE
{


public static int find_index(int[] Ar,int i)
{
for(int a=0;a<Ar.length;a++)
if(Ar[a]==i)
return a;

return -1;
}

public static void shift(int ele,int index,int[] Ar)
{

for(int i=Ar.length-1;i>=index;i--)
{
Ar[i]=Ar[i-1];
}
Ar[index]=ele;
}


public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int n=Integer.parseInt(br.readLine());
int Ar[]=new int[n+1];

String[] inp=br.readLine().split(" ");

int total=0;
for(int pos=0;pos<n;pos++)
{
int token=Integer.parseInt(inp[pos]);

int index=find_index(Ar,token)+1;   //due to being right at it.

if(index==-1||index==0)
Ar[pos+1]=pos+1;                       //pos+1 is the element
else
{

int ele=pos+1;
if((ele-index)<(index-1))
{
total+=ele-index;

}
else
{
total+=(index-1);

}



shift(pos+1,index,Ar);             //pos+1 is the element
}


}


System.out.println(total);
}

}
}