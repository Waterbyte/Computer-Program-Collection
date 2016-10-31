import java.io.*;
class ANUWTA
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int n=Integer.parseInt(br.readLine());
long value=(2*n+(((long)n*(n-1))/2));
System.out.println(value);  
}


}
}