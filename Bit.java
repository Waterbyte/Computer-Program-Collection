import java.util.*;
class Bit {
	
	public static boolean decide(int a,int b)
	{
    int aa=a&b;
	String s="";
	while(aa!=0)
	{
	s=s+aa%2;
	aa=aa/2;
	}
	int count=0;
	int len=s.length();
	for(int i=0;i<len;i++)
	{
		if(s.charAt(i)=='1')
		count+=1;
	}
	if(count==1)
	{
		return true;
	}
	return false;
	
	}
	
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        { 
        	boolean alpha=false;
        	int n=sc.nextInt();
        	int Ar[]=new int[n];
        	for(int i=0;i<n;i++)
        	{
        		Ar[i]=sc.nextInt();
        	}
        	for(int i=0;i<n;i++)
        	{
        		if(alpha==true)
        		break;
        		for(int j=0;j<n;j++)
        		{
        			if(i!=j)
        			{
        			int a=Ar[i];
        			int b=Ar[j];
        			alpha=decide(a,b);
        			
        			if(alpha==true)
        			{
        				break;
        			}
        			
        			}
        		}
        	}
        	if(alpha==true)
        	System.out.println("YES");
        	else
        	System.out.println("NO");
        	
        	
        }
            }
}
