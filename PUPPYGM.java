import java.io.*;
class PUPPYGM
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String[] data=br.readLine().split(" ");

int a=Integer.parseInt(data[0]);
int b=Integer.parseInt(data[1]);
int c=a^b;
if(c==0)
System.out.println("Vanika");
else
System.out.println("Tuzik");


}

}
}