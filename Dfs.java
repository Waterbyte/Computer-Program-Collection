import java.io.*;
import java.util.*;

public class Dfs
{
public void create_graph(int[][] adj, int n)
{
Scanner sc=new Scanner(System.in);
int from,to;
int enter=0;
System.out.println("Press 1 to enter a node and 0 to exit");
enter=sc.nextInt();
while(enter==1)
{
System.out.println("Enter the node where edge is from to the destination node");
from=sc.nextInt();
to=sc.nextInt();
adj[from][to]=1;
System.out.println("Press 1 to enter a node and 0 to exit");
enter=sc.nextInt();
}
}
public void dfsit(int x,int[][] adj,int n,int[] visited)
{
visited[x]=1;
System.out.println("The following node is visted-"+x);
for(int j=0;j<n;j++)
{
if(adj[x][j]==1&&visited[j]==0)
{
dfsit(j,adj,n,visited);
}
}



}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of nodes in the graph");
int n=sc.nextInt();
Dfs ob=new Dfs();
int[][] adj=new int[n][n];
ob.create_graph(adj,n);
int[] visited=new int[n];
for(int i=0;i<n;i++)
visited[i]=0;

for(int i=0;i<n;i++)
{
if(visited[i]==0)
ob.dfsit(i,adj,n,visited);
}

}}