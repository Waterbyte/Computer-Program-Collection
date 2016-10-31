import java.util.*;
public class FindPath
{
public static char[][] maze;
public static int row,col,str,stc,edr,edc;

public static class Graph
{
int a;
int b;
Graph prev;
public String toString() {
		return "[" + a + ", " + b + "]";
	}
}
public static Graph mPair(int aa,int bb, Graph prevs)
{
Graph g=new Graph();
g.a=aa;
g.b=bb;
g.prev=prevs;
return g;
}


public static void search()
{
boolean visited[][]=new boolean[row][col];
LinkedList<Graph> q=new LinkedList<Graph>();
q.add(mPair(str,stc,null));
Graph step=null;
boolean findDest=false;
while(!q.isEmpty()&&!findDest)
{
int x=q.peek().a;
int y=q.peek().b;
visited[x][y]=true;
step=q.remove();
if(x==edr&&y==edc)
{
findDest=true;
break;
}
if(x+1<col&&maze[x+1][y]!='%'&&!visited[x+1][y])
{
q.add(mPair(x+1,y,step));
}
if(x-1>0&&maze[x-1][y]!='%'&&!visited[x-1][y])
{
q.add(mPair(x-1,y,step));
}
if(y+1<row&&maze[x][y+1]!='%'&&!visited[x][y+1])
{
q.add(mPair(x,y+1,step));
}
if(y-1>0&&maze[x][y-1]!='%'&&!visited[x][y-1])
{
q.add(mPair(x,y-1,step));
}


}
if(findDest)
{
System.out.println("Path found");
ArrayList<Graph> path = new ArrayList<Graph>();
			while(step != null) {
				path.add(step);
				step = step.prev;
			}
			Collections.reverse(path);
			for(int i = 0; i < path.size(); i++) {
				if(i == path.size() - 1) {
					System.out.println(path.get(i));
				}
				else {
					System.out.print(path.get(i) + " -> ");
				}
			}

}
else
System.out.println("Path not found");

}




public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
 row=sc.nextInt();
 col=sc.nextInt();
 str=sc.nextInt();
 stc=sc.nextInt();
 edr=sc.nextInt();
 edc=sc.nextInt();
sc.nextLine();
maze=new char[row][col];
for(int i=0;i<row;i++)
{
String s=sc.nextLine();
for(int j=0;j<s.length();j++)
{
maze[i][j]=s.charAt(j);
}
}
search();
}


}