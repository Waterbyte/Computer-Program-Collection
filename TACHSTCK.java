import java.io.*;
import java.util.*;
class TACHSTCK
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String[] inp=br.readLine().split(" ");
int n=Integer.parseInt(inp[0]);
int d=Integer.parseInt(inp[1]);

int[] data=new int[n];
for(int i=0;i<n;i++)
data[i]=Integer.parseInt(br.readLine());

Arrays.sort(data);

int count=0;

while(n-->1)
{
if((data[n]-data[n-1])<=d)
{

count+=1;
n-=1;
}

}

System.out.println(count);
}
}