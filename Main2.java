import java.util.*;
public class Main2
{

public static boolean check(String s)
{

int len2=s.length();
int a=0,b=0,c=0;

for(int i=0;i<len2;i++)
{
char cc=s.charAt(i);
if(cc=='A')
a++;
else if(cc=='B')
b++;
else if(cc=='C')
c++;
}
if(a==b&&b==c&&((a+b+c)==len2))
return true;

return false;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s;
s=sc.nextLine();
int len=s.length();
long count=0l;
for(int i=0;i<len;i++)
{
for(int j=i+3;j<=len;j++)
{

String ss=s.substring(i,j);

if(check(ss)==true)
count+=1;
}
}
System.out.println(count);

}

}