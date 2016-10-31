import java.util.*;
public class Test1
{
static	int[] keyvalue;
static int[] val=new int[100005];
static	void funct(int init,int targ)
	{
		val[init]=0;
		LinkedList<Integer> q=new LinkedList<Integer>();
		q.add(init);
		while(q.size()!=0)
		{
			int f=q.remove();
			for(int i=0;i<keyvalue.length;i++)
			{
				int nw=(int)((1L*f*keyvalue[i])%100000);
				try
				{
				if(val[nw]==-1)
				{
					val[nw]=1+val[f];
					q.add(nw);
				}
				}
				catch(Exception e)
				{
					System.out.println("Errr: "+nw);
				}
			}
		}
    
	System.out.println(val[targ]);

		
	}
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int init=sc.nextInt();
		int targ=sc.nextInt();
		
		int keys=sc.nextInt();
	    keyvalue=new int[keys];
		for(int i=0;i<keys;i++)
		{
			keyvalue[i]=sc.nextInt();
		}
		for(int i=0;i<val.length;i++)
		{
			val[i]=-1;
		}
		
	    funct(init,targ);
	
	}
	
	
}