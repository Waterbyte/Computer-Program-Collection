import java.io.*;
class LCS
{

public static int lcs(String a,String b,int m,int n)
{
int L[][]=new int[m+1][n+1];
int i,j;

for(i=0;i<=m;i++)
{
for(j=0;j<=n;j++)
{
if(i==0||j==0)
L[i][j]=0;
else if(a.charAt(i-1)==b.charAt(j-1))
L[i][j]=L[i-1][j-1]+1;
else
L[i][j]=Math.max(L[i-1][j],L[i][j-1]);
}
}

String s="";
while(i>0&&j>0)
{
if(a.charAt(i-1)==b.charAt(j-1))
s=a.charAt(i-1)+s;
else if(L[i-1][j]>L[i][j-1])
i--;
else
j--;
}

System.out.println(s);

return L[m][n];

}




public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter two strings.");

String a=br.readLine();
String b=br.readLine();

int len_A=a.length();
int len_B=b.length();


int value=lcs(a,b,len_A,len_B);
System.out.println(value);

}

}