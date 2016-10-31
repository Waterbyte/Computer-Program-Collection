import java.io.*;
import java.text.*;
import java.math.*;
class CHDOGS
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String[] data=br.readLine().split(" ");

Double s=Double.parseDouble(data[0]);
Double v=Double.parseDouble(data[1]);


Double d=(2*s)/(3*v);

System.out.println(d);

}
}
}