import java.io.*;
public class ATTIC
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String s=br.readLine();


int max_so_far=0;
int total=0;

for(int i=0;i<(s.length()-1);i++)
{
char c=s.charAt(i);
int max=0;
if(c=='.')
{
while(s.charAt(i)=='.')
{
max+=1;
i+=1;
}
if(max>max_so_far)
{
max_so_far=max;
total+=1;
}

}



}
System.out.println(total);






}




}
}