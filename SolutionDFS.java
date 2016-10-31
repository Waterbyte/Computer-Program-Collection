import java.util.*;
public class SolutionDFS
{
public static int ans=0;
public static class Graph
{
private LinkedList<Integer> adj[];
private int nodes;
private boolean[] visit;
Graph(int nodess)
{
nodes=nodess;
visit=new boolean[nodess+1];
adj=new LinkedList[nodess+1];
for(int i=1;i<=nodess;i++)
adj[i]=new LinkedList();
}
void addEdge(int v,int w)
{
adj[v].add(w);
adj[w].add(v);
}

int dfs(int node)
{
visit[node]=true;
int num_vertex=0;
   Iterator<Integer> i=adj[node].listIterator();
   while(i.hasNext())
   { 
int t=i.next();
     if(!visit[t])
      {
         int num_nodes=dfs(t); 
         if(num_nodes%2==0)
         ans++;
         else
         num_vertex+=num_nodes;
         }


     }
return num_vertex+1;

}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int nodes=sc.nextInt();
int edges=sc.nextInt();
Graph ob=new Graph(nodes);
for(int i=0;i<edges;i++)
{
int u=sc.nextInt();
int v=sc.nextInt();
ob.addEdge(u,v);
}
ob.dfs(1);
System.out.println(ans);

}
}