import java.io.*;
import java.util.*;
public class RRCOPY
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int t=Integer.parseInt(br.readLine());
HashSet<Integer> set=new HashSet<Integer>();
while(t-->0)
{

set.clear();

int n=Integer.parseInt(br.readLine());
String[] s=br.readLine().split(" ");
for(int i=0;i<n;i++)
{
set.add(Integer.parseInt(s[i]));
}

System.out.println(set.size());

}

}
}