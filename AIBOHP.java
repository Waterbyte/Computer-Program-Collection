import java.io.*;
class AIBOHP
{
public static int lcs(String a,String b,int len1,int len2)
{
int table[][]=new int[len1+1][len2+1];

for(int i=0;i<=len1;i++)
{
for(int j=0;j<=len2;j++)
{
if(i==0||j==0)
table[i][j]=0;
else if(a.charAt(i-1)==b.charAt(j-1))
table[i][j]=1+table[i-1][j-1];
else 
table[i][j]=Math.max(table[i-1][j],table[i][j-1]);

}
}

for(int i=0;i<=len1;i++)
{
for(int j=0;j<=len2;j++)
{
System.out.print(table[i][j]+" ");
}
System.out.println();
}
return(table[len1][len2]);


}

public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String a=br.readLine();
String b="";
int len=a.length();
for(int i=0;i<len;i++)
{
b=a.charAt(i)+b;
}

int val=lcs(a,b,len,len);
System.out.println(len-val);
}

}
}