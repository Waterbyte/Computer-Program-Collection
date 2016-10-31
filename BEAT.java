import java.io.*;
import java.util.*;
class BEAT
{

static int precalculate(int n)
{
int sum=0;boolean flag=false;
    while (n%2 == 0)
    {
        sum+=1;
        n = n/2;
		flag=true;
    }
	if(flag)
	{
	flag=false;
	sum+=1;
	}
    for (int i = 3; i <= Math.sqrt(n); i = i+2)
    {
        while (n%i == 0)
        {
            sum+=1;
            n = n/i;
			flag=true;
        }
		if(flag)
	{
	flag=false;
	sum+=1;
	}
		
    }
 
    
    if (n > 2)
        sum+=2;
		
		
return sum;
}

public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String[] data=br.readLine().split(" ");

int t=Integer.parseInt(data[0]);
int n=Integer.parseInt(data[1]);
int Ar[]=new int[n+1];


for(int i=1;i<=n;i++)
{
Ar[i]=precalculate(i);
}
Ar[1]=1;
Ar[2]=2;

while(t-->0)
{
int count=0;
int strength=0;
int num=Integer.parseInt(br.readLine());
if(num==1||num==2)
strength=num;
else
strength=precalculate(num);
for(int i=1;i<=n;i++)
{
if(strength>Ar[i])
count++;
}
System.out.println(count);
}




}
}
