import java.util.*;
public class Main5
{

public static long combination(long n, long k)
{
    return permutation(n) / (permutation(k) * permutation(n - k));
}

public static long permutation(long i)
{
    if (i <= 1)
    {
        return 1;
    }
    return i * permutation(i - 1);
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
long value=0;
long num=sc.nextInt();
for(int i=0;i<num;i++)
{
value+=sc.nextInt();
}

long value2=combination(value-1,num)%(1000000007);
System.out.println(value2);


}




}
}