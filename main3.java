import java.util.*;
public class main3
{
public static int euclidean(int a,int b)
{
if(b==0)
return a;
else
return euclidean(b,a%b);
}



public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int num=sc.nextInt();

int Ar1[]=new int[num];
int Ar2[]=new int[num];
sc.nextLine();
for(int i=0;i<num;i++)
{
 String s[] = sc.nextLine().split("/");
    Ar1[i]   = Integer.parseInt(s[0]);
    Ar2[i]   = Integer.parseInt(s[1]);
}


for(int i=0;i<num;i++)
{
int finalx=0,finaly=0;
double oldvalue=0;int value1=0,value2=0;
for(int j=i;j<num;j++)
{
value1+=Ar1[j];
value2+=Ar2[j];

if(((double)value1/(double)value2)>=oldvalue)
{
oldvalue=(double)value1/(double)value2;
finalx=value1;
finaly=value2;
}
else
{
break;
}


}

int c=euclidean(finalx,finaly);
finalx=finalx/c;
finaly=finaly/c;

System.out.println(finalx+"/"+finaly);
}

System.out.println(" ");
while(t>1)
sc.nextLine();
}

}

}