import java.io.*;
import java.util.*;
public class RESQ
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int num=Integer.parseInt(br.readLine());

int min=999999999;

for(int i=1;i<=(int)Math.sqrt(num);i++)
if(num%i==0)
min=Math.min( min,Math.abs(i-num/i));

System.out.println(min);
}


}
}