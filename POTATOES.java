import java.io.*;
import java.math.*;
import java.util.*;
public class POTATOES
{
public static int targ=2100;
public static ArrayList<Integer> ar=new ArrayList<Integer>();

public static void create()
{
int Ar[]=new int[targ];
for(int i=2;i<Math.sqrt(targ);i++)
{
int j=2;
while(j*i<targ)
{
Ar[j*i]=1;
j++;
}
}

for(int i=1;i<targ;i++)
{
if(Ar[i]==0)
ar.add(i);
}


}





public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
create();
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String inp[]=br.readLine().split(" ");
int total=Integer.parseInt(inp[0])+Integer.parseInt(inp[1]);

for(int i=0;i<ar.size();i++)
{
if(ar.get(i)>total)
{
System.out.println(ar.get(i)-total);
break;
}
}

}



}
}


