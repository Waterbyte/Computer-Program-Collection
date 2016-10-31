import java.io.*;
import java.util.*;
class CHEFKEY
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int count=0;

String data[]=br.readLine().split(" ");
int p=Integer.parseInt(data[0]);
int q=Integer.parseInt(data[1]);
int r=Integer.parseInt(data[2]);

ArrayList<Integer> factor=new ArrayList<Integer>();
for(int i=1;i<=r/2;i++)
{
if(r%i==0)factor.add(i);
}
factor.add(r);

Integer[] factors=factor.toArray(new Integer[0]);
int length=factors.length;

for(int i=0;i<length;i++)
{
int a=factors[i];
int b=factors[length-1-i];

if(a<=p&&b<=q&&(a*b==r))
{

count+=1;
}

}

System.out.println(count);
}


}
}