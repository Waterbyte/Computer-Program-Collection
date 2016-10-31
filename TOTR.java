import java.io.*;
import java.math.*;
import java.util.*;
public class TOTR
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String[] data=br.readLine().split(" ");

int num=Integer.parseInt(data[0]);

char[] Ar=new char[data[1].length()];
String[] Ar2="abcdefghijklmnopqrstuvwxyz".split("");

for(int i=0;i<data[1].length();i++)
{
Ar[i]=data[1].charAt(i);
}

while(num-->0)
{

String inp=br.readLine();
String s="";
for(int i=0;i<inp.length();i++)
{
char c=inp.charAt(i);

if(Character.isLetter(c))
{
for(int j=0;j<Ar2.length;j++)
{
if(c==Ar2[j].charAt(0)||Character.toLowerCase(c)==Ar2[j].charAt(0))
{
if((int)c<97)
s+=Character.toUpperCase(Ar[j]);
else
s+=Ar[j];
}
}
}
else
{
if(c=='_')
s+=" ";
else
s+=c;
}

}



System.out.println(s);
}



}
}
