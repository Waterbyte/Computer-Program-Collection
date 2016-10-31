import java.io.*;
import java.util.*;
public class Voters
{
public static HashSet<Integer> set=new HashSet<Integer>();




public static void check(int[] first,int len1,int[] second)
{
for(int i=0;i<len1;i++)
{
if(Arrays.binarySearch(second,first[i])>-1)
set.add(first[i]);
}


}




public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String[] inp=br.readLine().split(" ");

int n1=Integer.parseInt(inp[0]);
int n2=Integer.parseInt(inp[1]);
int n3=Integer.parseInt(inp[2]);

int Ar1[]=new int[n1];
int Ar2[]=new int[n2];
int Ar3[]=new int[n3];

for(int i=0;i<n1;i++)
Ar1[i]=Integer.parseInt(br.readLine());

for(int i=0;i<n2;i++)
Ar2[i]=Integer.parseInt(br.readLine());

for(int i=0;i<n3;i++)
Ar3[i]=Integer.parseInt(br.readLine());

check(Ar1,n1,Ar2);
check(Ar1,n1,Ar3);
check(Ar2,n2,Ar3);

TreeSet myTree=new TreeSet();
myTree.addAll(set);
System.out.println(myTree.size());
Iterator itr=myTree.iterator();
while(itr.hasNext())
System.out.println(itr.next());


//int[] array=set.stream().mapToInt(Number::intValue).toArray();
//Arrays.sort(array);
//System.out.println(array.length);
//for(Integer number:array)
//{
//System.out.println(number);
//}

}

}