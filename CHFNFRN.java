import java.io.*;
import java.util.*;
class CHFNFRN
{

public static boolean bipartite(int[][] Gr,int nodes,int src)
{

int colorArr[]=new int[nodes+1];
Arrays.fill(colorArr,-1);

LinkedList<Integer> q=new LinkedList<Integer>();
q.add(src);
colorArr[src]=1;

while(q.size()!=0)
{
int u=q.poll();
for(int v=1;v<=nodes;v++)
{
if(Gr[u][v]==1&&colorArr[v]==-1)
{
colorArr[v]=1-colorArr[u];
q.add(v);
}
else if(Gr[u][v]==1&&colorArr[v]==colorArr[u])
{
System.out.println(u+"  "+v);
System.out.println(colorArr[u]+"  "+colorArr[v]);
return false;
}
}

}

return true;
}




public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-->0)
{
String line[]=br.readLine().split(" ");
int nodes=Integer.parseInt(line[0]);
int queries=Integer.parseInt(line[1]);

int Gr[][]=new int[nodes+1][nodes+1];
int src=0;
for(int i=0;i<queries;i++)
{
String[] line2=br.readLine().split(" ");
int u=Integer.parseInt(line2[0]);
int v=Integer.parseInt(line2[1]);

if(i==0)
src=u;

Gr[v][u]=1;
Gr[u][v]=1;
}
if(bipartite(Gr,nodes,src))
System.out.println("YES");
else
System.out.println("NO");
}
}
}