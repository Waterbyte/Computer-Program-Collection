import java.io.*;
public class NUMGAME2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int num=Integer.parseInt(br.readLine());
if(num%4==1)
{
System.out.println("ALICE");
}
else
System.out.println("BOB");




}


}

}