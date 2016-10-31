import java.io.*;
class HELPLIRA
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
double max=Integer.MIN_VALUE;
double min=Integer.MAX_VALUE; 
int maxIndex=0;
int minIndex=0;
for(int ii=1;ii<=t;ii++)
{
int[] Ar=new int[6];
String lin[]=br.readLine().split(" ");
for(int i=0;i<6;i++)
Ar[i]=Integer.parseInt(lin[i]);

int xa=Ar[2]-Ar[0];
int ya=Ar[3]-Ar[1];
double a=Math.sqrt(xa*xa+ya*ya);

int xb=Ar[4]-Ar[0];
int yb=Ar[5]-Ar[1];
double b=Math.sqrt(xb*xb+yb*yb);

int xc=Ar[4]-Ar[2];
int yc=Ar[5]-Ar[3];
double c=Math.sqrt(xc*xc+yc*yc);

double s=(a+b+c)/2;

double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

if(area>=max)
{
max=area;
maxIndex=ii;
}
if(area<=min)
{
min=area;
minIndex=ii;
}
}
System.out.println(minIndex+" "+maxIndex);

}
}