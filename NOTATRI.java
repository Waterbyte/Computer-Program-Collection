import java.io.*;
import java.util.*;
 class NOTATRI
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		while(n!=0)
		{
			String temp1=br.readLine();
			String[] temp2=new String[n];
			temp2=temp1.split(" ");
			int[] stickl=new int[n];
			for(int i=0;i<n;i++)
			{
				stickl[i]=Integer.parseInt(temp2[i]);
			}
			Arrays.sort(stickl);
			int count=0;
			for(int j=(n-1);j>=2;j--)
			{
				int left=0;
				int right=(j-1);
				while(left<right)
				{
					if((stickl[left]+stickl[right])<stickl[j])
 
					{
					
						count+=right-left;
						left++;
					}
					else
					{
						right--;
					}
				}
			}
			System.out.println(count);
			n=Integer.parseInt(br.readLine());
		}
	}
} 