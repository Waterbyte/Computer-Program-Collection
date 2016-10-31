import java.io.*;
import java.util.*;
class Combo
{

public static String format(String s)
{
int len=s.length();
int diff=10-len;

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


public static void main(String[] args)
{
for(long i=0;i<Math.pow(2,10);i++)
{
String s=Long.toBinaryString(i);
System.out.println(format(s));
}

}
}