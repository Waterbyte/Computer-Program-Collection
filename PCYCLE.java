import java.io.*;
public class PCYCLE
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
String num_S[]=br.readLine().split(" ");
String s="";
int count=0;
int num[]=new int[n+1];
for(int i=0;i<n;i++)
{
num[i+1]=Integer.parseInt(num_S[i]);
}
int i=1;
while(i<=n)
{
	
if(num[i]!=0)
{
	count+=1;
s=s+i+" ";
int j=i;
while(num[j]!=0)
{
s=s+num[j]+" ";
int temp=num[j];
num[j]=0;
j=temp;

}
s=s+"\n";
}
i++;
}

System.out.println(count);
System.out.println(s);
}
}