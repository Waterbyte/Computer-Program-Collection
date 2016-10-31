import java.io.*;
import java.util.*;

public class Solution {

    class Graph
        {
        private LinkedList<Integers> adj[];
        private int nodes;
        
        Graph(int nodess)
            {
            nodes=nodess;
            adj[]=new LinkedList[nodes];
            for(int i=0;i<nodes;i++)
                adj[i]=new LinkedList[]();
        }
        void addEdge(int v,int w)
            {
            adj[v].add(w);
        }
        
        void BFS(int s)
            {
            boolean visited[]=new boolean[nodes];
            LinkedList<Integer> Queue=new LinkedList<Integer>();
            
            visited[s]=true;
            Queue.add(s);
            
            while(!Queue.size()==0)
                {
                s=Queue.poll();
                Iterator<Integer> i=adj[s].listIterator();
                while(i.hasNext())
                    {
                    int n=i.next();
                    if(!visited[n])
                        {
                        visited[n]=true;
                        Queue.add(n);
                    }
                }
                
                
            }
            
            
            
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