import java.io.*;
import java.util.*;
class ICPC16A
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String[] line=br.readLine().split(" ");
int x1=Integer.parseInt(line[0]);
int y1=Integer.parseInt(line[1]);
int x2=Integer.parseInt(line[2]);
int y2=Integer.parseInt(line[3]);


if(x1==x2&&y1>y2)
{
System.out.println("down");
}
else if(x1==x2&&y1<y2)
{
System.out.println("up");
}
else if(y1==y2&&x1<x2)
System.out.println("right");
else if(y1==y2&&x1>x2)
System.out.println("left");
else
System.out.println("sad");

}
}
}