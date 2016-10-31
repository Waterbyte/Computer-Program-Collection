import java.io.*;
import java.util.*;
class BlackHat
{
public static void calculate(String s)
{
int AR[]=new int[26];
String M="";
for(int i=0;i<s.length();i++)
{
char c=s.charAt(i);
int pos=(int)c;
M=M+ (char)(97+ ((13+AR[pos-97]+(pos-97))%26));
AR[pos-97]++;
}
System.out.println(M);
}

public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String s=br.readLine();
calculate(s);
}
}
}