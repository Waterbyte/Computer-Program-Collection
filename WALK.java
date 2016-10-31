import java.io.*;
class WALK
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int num=Integer.parseInt(br.readLine());
String data[]=br.readLine().split(" ");

int max=0,index=0;
for(int i=0;i<num;i++)
{
if(Integer.parseInt(data[i])>=max)
{
max=Integer.parseInt(data[i]);
index=i;
}

}

System.out.println(Math.max(num,(max+index)));


}
}
}