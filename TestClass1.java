import java.util.*;

class TestClass1 {
	static  int field[][]=new int[7][8];
	static int t=0,id=0,t_id=0;
	
	public static int check_down(int i,int j)
	{
		if(i==6)
		return 2;
		if(i==5)
		{
			if(field[i+1][j]==t_id)
			return 3;
		}
		if(i==4)
		{
			if(field[i+1][j]==t_id&&field[i+2][j]==t_id)
			return 4;
		}
		if(i<=3)
		{
			if(field[i+1][j]==t_id&&field[i+2][j]==t_id&&field[i+3][j]==t_id)
			return 600;
			if(field[i+1][j]!=t_id&&field[i+2][j]!=t_id&&field[i+3][j]!=t_id)
			return 500;
		}
		return 1;
	}
	
	public static int horizontal(int i,int j)
	{
		if(j==0)
		{
		if(field[i][j+1]==t_id&&field[i][j+2]==t_id&&field[i][j+3]==t_id)
		return 600;
		if(field[i][j+1]!=t_id&&field[i][j+2]!=t_id&&field[i][j+3]!=t_id)
		return 500;
		}
		if(j==1)
		{
			if(field[i][j+1]==t_id&&field[i][j+2]==t_id&&field[i][j+3]==t_id)
		return 600;
		if(field[i][j+1]!=t_id&&field[i][j+2]!=t_id&&field[i][j+3]!=t_id)
		return 500;
		if(field[i][j-1]==t_id&&field[i][j+1]==t_id&&field[i][j+2]==t_id)
		return 600;
		if(field[i][j-1]!=t_id&&field[i][j+1]!=t_id&&field[i][j+2]!=t_id)
		return 500;
		}
		if(j==2)
		{
			if(field[i][j+1]==t_id&&field[i][j+2]==t_id&&field[i][j+3]==t_id)
		return 600;
		if(field[i][j+1]!=t_id&&field[i][j+2]!=t_id&&field[i][j+3]!=t_id)
		return 500;
		if(field[i][j-1]==t_id&&field[i][j+1]==t_id&&field[i][j+2]==t_id)
		return 600;
		if(field[i][j-1]!=t_id&&field[i][j+1]!=t_id&&field[i][j+2]!=t_id)
		return 500;
		if(field[i][j+1]==t_id&&field[i][j-1]==t_id&&field[i][j-2]==t_id)
		return 600;
		if(field[i][j+1]!=t_id&&field[i][j-1]!=t_id&&field[i][j-2]!=t_id)
		return 500;
		}
		if(j==3)
		{
				if(field[i][j+1]==t_id&&field[i][j+2]==t_id&&field[i][j+3]==t_id)
		return 600;
		if(field[i][j+1]!=t_id&&field[i][j+2]!=t_id&&field[i][j+3]!=t_id)
		return 500;
		if(field[i][j-1]==t_id&&field[i][j+1]==t_id&&field[i][j+2]==t_id)
		return 600;
		if(field[i][j-1]!=t_id&&field[i][j+1]!=t_id&&field[i][j+2]!=t_id)
		return 500;
		if(field[i][j+1]==t_id&&field[i][j-1]==t_id&&field[i][j-2]==t_id)
		return 600;
		if(field[i][j+1]!=t_id&&field[i][j-1]!=t_id&&field[i][j-2]!=t_id)
		return 500;
		}
		if(j==4)
		{
			if(field[i][j+1]==t_id&&field[i][j+2]==t_id&&field[i][j+3]==t_id)
		return 600;
		if(field[i][j+1]!=t_id&&field[i][j+2]!=t_id&&field[i][j+3]!=t_id)
		return 500;
		if(field[i][j-1]==t_id&&field[i][j+1]==t_id&&field[i][j+2]==t_id)
		return 600;
		if(field[i][j-1]!=t_id&&field[i][j+1]!=t_id&&field[i][j+2]!=t_id)
		return 500;
		if(field[i][j+1]==t_id&&field[i][j-1]==t_id&&field[i][j-2]==t_id)
		return 600;
		if(field[i][j+1]!=t_id&&field[i][j-1]!=t_id&&field[i][j-2]!=t_id)
		return 500;
		}
		if(j==5)
		{
		if(field[i][j-1]==t_id&&field[i][j-2]==t_id&&field[i][j-3]==t_id)
		return 600;
		if(field[i][j-1]!=t_id&&field[i][j-2]!=t_id&&field[i][j-3]!=t_id)
		return 500;
		if(field[i][j+1]==t_id&&field[i][j-1]==t_id&&field[i][j-2]==t_id)
		return 600;
		if(field[i][j+1]!=t_id&&field[i][j-1]!=t_id&&field[i][j-2]!=t_id)
		return 500;
		if(field[i][j-1]==t_id&&field[i][j+1]==t_id&&field[i][j+2]==t_id)
		return 600;
		if(field[i][j-1]!=t_id&&field[i][j+1]!=t_id&&field[i][j+2]!=t_id)
		return 500;
		}
		if(j==6)
		{
			if(field[i][j-1]==t_id&&field[i][j-2]==t_id&&field[i][j-3]==t_id)
		return 600;
		if(field[i][j-1]!=t_id&&field[i][j-2]!=t_id&&field[i][j-3]!=t_id)
		return 500;
		if(field[i][j+1]==t_id&&field[i][j-1]==t_id&&field[i][j-2]==t_id)
		return 600;
		if(field[i][j+1]!=t_id&&field[i][j-1]!=t_id&&field[i][j-2]!=t_id)
		return 500;
		}
		if(j==7)
		{
			if(field[i][j-1]==t_id&&field[i][j-2]==t_id&&field[i][j-3]==t_id)
		return 600;
		if(field[i][j-1]!=t_id&&field[i][j-2]!=t_id&&field[i][j-3]!=t_id)
		return 500;
		}
		return 1;
	}
	
	
	public static void start()
	{
		int att=0,def=0;
		int check[]=new int[8];
		int solution[]=new int[8];
		for(int j=0;j<8;j++)
		{
			check[j]=100;
		}
		
		for(int j=0;j<8;j++)
		{
			
			for(int i=6;i>=0;i--)
			{
				if(field[i][j]==0)
				{
					check[j]=i;
				break;
				}
			}
		
		}
		
//for check_down
for(int j=0;j<8;j++)
{
	if(check[j]!=100)
	{
	solution[j]=check_down(check[j],j);
	}
}
//for horizontal
for(int j=0;j<8;j++)
{
	if(check[j]!=100)
	{
		solution[j]+=horizontal(check[j],j);
	}
}

	int max_solution=0,realsolution=0;
for(int j=0;j<8;j++)
{
	if(solution[j]>max_solution)
	{
		max_solution=solution[j];
		realsolution=j;
	}
}
	
		System.out.println(realsolution);
	}
	
	
	
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
       
        for(int i=0;i<7;i++)
        {
        	for(int j=0;j<8;j++)
        	{
        	field[i][j]=sc.nextInt();
        }
        }
        
     id=sc.nextInt();
     if(t==0)
     {
     t_id=id;
     t++;
     }
     
     if(id==t_id)
     {
     start();
     }
        
    }
}
