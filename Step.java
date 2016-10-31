public class Step
{
public static long M[]=new long[100];
public static long count(int n)
{
M[0]=1l;
M[1]=1l;
for(int i=2;i<=n;i++)
M[i]=M[i-1]+M[i-2];
return M[n];
}

public static void main(String args[])
{
int num=20;

System.out.println(count(num));

}

}