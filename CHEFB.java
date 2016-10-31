import java.util.*;
public class CHEFB
{

public static void removeRedundate(int n,int[] Ar)
{
Set<Integer> set=new HashSet<Integer>();
for(int i=0;i<n;i++)
{
set.add(Ar[i]);
}
n=set.size();
int[] Br=new int[n];
int i=0;int count=0;
for(Integer val:set)
{
	Br[i++]=val;
	if(val!=1)
		count++;
}
calculate(n,Br);
System.out.println(count);
}



public static void calculate(int n,int[] Ar)
{
//System.out.println(Arrays.toString(Ar));

}




public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int n=sc.nextInt();
int Ar[]=new int[n];

for(int i=0;i<n;i++)
{
Ar[i]=sc.nextInt();
}

removeRedundate(n,Ar);


}
}
}