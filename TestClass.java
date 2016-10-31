import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(--t>-1)
       {
       	int Swp=sc.nextInt();
       	int Fr=sc.nextInt();
       	int bubs=sc.nextInt();
       	sc.nextLine();
       	char[] pat1=new char[bubs];
       	String s=sc.nextLine();
       	for(int i=0;i<bubs;i++)
       	{
       		pat1[i]=s.charAt(i);
       	}
       	int fbubs=sc.nextInt();
       	sc.nextLine();
       	char[] pat2=new char[fbubs];
       	String s2=sc.nextLine();
       	for(int i=0;i<fbubs;i++)
       	{
       		pat2[i]=s2.charAt(i);
       	}
       	
       	if(bubs==fbubs&&s.equals(s2))
       	{
       		System.out.println(Swp);
       		int d=Fr+bubs*10;
       		System.out.println(d);
       		if(d>Swp)
       		System.out.println("Friend");
       		else if(d==Swp)
       		System.out.println("Tie");
       		else
       		System.out.println("Swapnil");
       	}
       	else
       	{
       		int value=0;
       		if(bubs>fbubs)
       		{
       			value=bubs-fbubs;
       			for(int i=0;i<fbubs;i++)
       			{
       				if(pat1[i]!=pat2[i])
       				value++;
       			}
       		}
       		else
       	
       		{
       			 value=fbubs-bubs;
       			for(int i=0;i<bubs;i++)
       			{
       				if(pat1[i]!=pat2[i])
       				value++;
       			}
       	
       		}
			int d=Swp+value*5;
       		System.out.println(d);
       		
			System.out.println(Fr);
       		if(d>Fr)
       		{
       			System.out.println("Swapnil");
       		}
       		else if(d==Fr)
       		{
       			System.out.println("Tie");
       		}
       		else
       		System.out.println("Friends");
       	}
       	
       	
       	
       	
       	
       }
    }
}
