import java.io.*;
public class LEPERMUT
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int n=Integer.parseInt(br.readLine());
String[] n_Ar=br.readLine().split(" ");
int[] Ar=new int[n];
for(int i=0;i<n;i++)
{
Ar[i]=Integer.parseInt(n_Ar[i]);
}

int local_inversion=0,global_Inversion=0;


for(int i=0;i<n;i++)
{
if(i!=n-1)
{
if(Ar[i]>Ar[i+1])
local_inversion+=1;
}
for(int j=i+1;j<n;j++)
{
if(Ar[i]>Ar[j])
global_Inversion+=1;
}
}



if(local_inversion==global_Inversion)
System.out.println("YES");
else
System.out.println("NO");

}


}

}