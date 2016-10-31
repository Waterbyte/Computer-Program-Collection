import java.io.*;
public class MARCHA
{
	
	public static boolean check(int n,int m,int[] notes)
	{
		boolean subset[][]=new boolean[m+1][n+1]; 
		
		for(int i=0;i<=n;i++)
		{
			subset[0][i]=true;
		}
		for(int i=1;i<=m;i++)
		{
			subset[i][0]=false;
		}
		
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				if(i>=notes[j-1])
				{
					subset[i][j]=subset[i][j-1]||subset[i-notes[j-1]][j-1];				
				}
			}
			
		}
		
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
				System.out.print("    "+subset[i][j]);
			System.out.println();
		}
		
		return  subset[m][n];
		}	
	
	
	
	
	
public static void main(String args[])throws IOException
{
InputStreamReader system=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(system);

int test=Integer.parseInt(br.readLine());

while(test-->0)
{

String[] money=br.readLine().split(" ");
int n=Integer.parseInt(money[0]);
int m=Integer.parseInt(money[1]);

int[] notes=new int[n];
for(int i=0;i<n;i++)
{
notes[i]=Integer.parseInt(br.readLine());
}

if(check(n,m,notes))
	System.out.println("Yes");
else
	System.out.println("No");

}
}

}