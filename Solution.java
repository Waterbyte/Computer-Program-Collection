import java.io.*;
import java.util.*;

public class Solution {

   public static class Graph
        {
        private LinkedList<Integer> adj[];
        private int nodes;
        
        Graph(int nodess)
            {
            nodes=nodess+1;
            adj=new LinkedList[nodes];
            for(int i=1;i<nodes;i++)
                adj[i]=new LinkedList<Integer>();
        }
        void addEdge(int v,int w)
            {
            adj[v].add(w);
            adj[w].add(v);
        }
        
        void BFS(int s)
            {
          int start =s;
          int counter[]=new int[nodes];

            boolean visited[]=new boolean[nodes];
           for(int j=0;j<nodes;j++)
          {
           counter[j]=-1;
           }
            LinkedList<Integer> Queue=new LinkedList<Integer>();
            
            visited[s]=true;
            counter[s]=0;
            Queue.add(s);
          
            while(Queue.size()!=0)
                {
                s=Queue.poll();

                Iterator<Integer> i=adj[s].listIterator();
                while(i.hasNext())
                    {
                    int n=i.next();
                    if(!visited[n])
                        {
                         visited[n]=true;
                        counter[n]=counter[s]+1;   
                        Queue.add(n);
                    }
                }
                
                
            }
            
            for(int j=1;j<nodes;j++)
{
if(j==start)
{
}
else
if(counter[j]==-1)
{
           System.out.print(counter[j]+" ");
}
else
{
System.out.print(counter[j]*6+" ");
}
}
System.out.println();

            
        }
        
    }
    
    
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int N_ofTest=sc.nextInt();
        for(int i=0;i<N_ofTest;i++)
            {
            int nodes=sc.nextInt();
            int edges=sc.nextInt();
            
            Graph obj=new Graph(nodes);
            for(int j=0;j<edges;j++)
                {
                int v=sc.nextInt();
                int w=sc.nextInt();
                obj.addEdge(v,w);
            }
            int start=sc.nextInt();
            obj.BFS(start);
            
            
            
            
        }
    }
}