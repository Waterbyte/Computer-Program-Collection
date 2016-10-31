import java.io.*;
import java.text.*;
import java.math.*;
import java.util.*;
class CHEFTWOS
{

public static boolean calculate_dp_Util(String s,int index,boolean[] visited)
{
	
}



public static boolean calculate_dp(String S)
{

boolean visited[]=new boolean[S.length()];

int value=0;
if(calculate_dp_Util(S,0,visited))
	return true;
else 
	return false;


}


public static int do_this(String s,String a,String b)
{
int len=s.length();
String[] aa=a.split("");
String[] bb=b.split("");
for(int i=0;i<len;i++)
{
if(s.charAt(i)=='1')
{
char temp=a.charAt(i);
aa[i]=bb[i];
bb[i]=temp+"";
}
}

String aaa="",bbb="";
for(int i=0;i<len;i++)
{
	aaa+=aa[i];
	bbb+=bb[i];
}



if(calculate_dp(aaa)&calculate_dp(bbb))
return 1;
else
return 0;


}

static String format(String s,int len2)
{
int len=s.length();
int diff=len2-len;
if(diff>0)
{
while(diff>0)
{
s="0"+s;
diff--;
}
}
return s;
}

static void try_it(String a,String b)
{

int value=0;
int len=a.length();
for(long i=0;i<Math.pow(2,len);i++)
{
String s=Long.toBinaryString(i);
s=format(s,len);
value+=do_this(s,a,b);
}
System.out.println(value);
}

public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String a=br.readLine();
String b=br.readLine();
try_it(a,b);
}
}
}

