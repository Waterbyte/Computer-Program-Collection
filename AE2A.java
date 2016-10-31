import java.io.*;
class AE2A
{

public static int check(int n,int x)
{
int table[][]=new int[n+1][x+1];

for(int i=1;i<=6;i++)
{
table[1][i]=1;
}

for(int i=2;i<=n;i++)
{
for(int j=1;j<=x;j++)
{
    for(int k=1;k<=6&&k<j;k++)
table[i][j]+=table[i-1][j-k];

}
}

for(int i=1;i<=n;i++)
{
for(int j=1;j<=x;j++)
{
System.out.print(table[i][j]+" ");
}
System.out.println();
}

return table[n][x];

}




public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String [] data=br.readLine().split(" ");
int n=Integer.parseInt(data[0]);
int k=Integer.parseInt(data[1]);
if(n<=550||k<=3300)
{
System.out.println(check(n,k));
}
else
System.out.println("0");

}
}
}