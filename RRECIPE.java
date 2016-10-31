import java.io.*;
class RRECIPE
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String s=br.readLine();
int n=s.length();
int value=1;
if(n%2==0)
{
for(int i=0;i<n/2;i++)
{
if(s.charAt(i)!=s.charAt(n-1-i)&&((s.charAt(i)!='?')&&(s.charAt(n-i-1))!='?'))
{
value=value*0;
break;
}
else if(s.charAt(i)==s.charAt(n-1-i)&&((s.charAt(i)=='?')||(s.charAt(n-i-1))=='?'))
{
value=(value*26)%10000009;
}
}
}
else
{
for(int i=0;i<n/2;i++)
{
if(s.charAt(n/2)=='?')
{
value=(value*26)%10000009;
}
if(s.charAt(i)!=s.charAt(n-1-i)&&((s.charAt(i)!='?')&&(s.charAt(n-i-1))!='?'))
{
value=value*0;
break;
}
if(s.charAt(i)==s.charAt(n-1-i)&&((s.charAt(i)=='?')||(s.charAt(n-i-1))=='?'))
{
value=(value*26)%10000009;
}

}
}
if(n==1&&s.charAt(0)=='?')
System.out.println("26");
else
System.out.println(value);
}
}
}