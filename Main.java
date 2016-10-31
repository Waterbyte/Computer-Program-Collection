import java.util.*;
public class Main
{
	public static int n=0,k=0,count=0;

public static void subs(String a,int i,String sub)
{

for(int j=0;(j+i)<=n;j++)
{
String c=a.substring(j,j+i);
if(Math.abs(c.compareTo(sub))<=k)
	count+=1;
}

}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
count=0;
n=sc.nextInt();
k=sc.nextInt();
sc.nextLine();
String a=sc.nextLine();
String b=sc.nextLine();
for(int i=1;i<=n;i++)
{
	for(int x=1;x<=n;x++)
	{
		for(int y=0;(y+x)<=n;y++)
		{
			if(x==i)
			{
			String d=b.substring(y,y+x);
			subs(a,i,d);
		    }
		}
	}


}
System.out.println(count);
}

}

}