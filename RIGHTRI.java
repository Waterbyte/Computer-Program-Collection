import java.io.*;
public class RIGHTRI
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int total=0;
int t=Integer.parseInt(br.readLine());
while(t-- > 0)
{
String s[]=br.readLine().split(" ");


int x1=Integer.parseInt(s[0]);
int y1=Integer.parseInt(s[1]);
int x2=Integer.parseInt(s[2]);
int y2=Integer.parseInt(s[3]);
int x3=Integer.parseInt(s[4]);
int y3=Integer.parseInt(s[5]);

int x21=x2-x1;
int x31=x3-x1;
int x32=x3-x2;
int y21=y2-y1;
int y31=y3-y1;
int y32=y3-y2;

double distance1=Math.pow(x21,2)+Math.pow(y21,2);
double distance2=Math.pow(x31,2)+Math.pow(y31,2);
double distance3=Math.pow(x32,2)+Math.pow(y32,2);


if(distance1>distance2&&distance1>distance3)
{
      if(distance1==distance2+distance3)
	  total+=1;
}
else if(distance2>distance1&&distance2>distance3)
{
if(distance2==distance1+distance3)
	  total+=1;
}
else
{
if(distance3==distance2+distance1)
	  total+=1;
}

}
System.out.println(total);


}
}