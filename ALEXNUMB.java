import java.io.*;
public class ALEXNUMB
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
long num=Integer.parseInt(br.readLine());
String[] data=br.readLine().split(" ");

int[] Ar=new int[(int)num];
for(int i=0;i<num;i++)
{
Ar[i]=Integer.parseInt(data[i]);
}

long count=0;
for(int i=0;i<num;i++)
{
for(int j=0;j<num;j++)
{
int num1=Ar[i]-1;
int num2=Ar[j]-1;


if(Ar[num1]<Ar[num2])
{
count++;
}

}
}

System.out.println(count);

}



}
}