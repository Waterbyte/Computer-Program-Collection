import java.io.*;
import java.util.*;
class BITREE
{
public static int[] BITREE;
public static int getSum(int BITREE[],int index)
{
int sum=0;
index=index+1;

while(index>0)
{
sum+=BITREE[index];
index-=index&(-index);

}
return sum;

}


public static void updateBIT(int n,int index,int val)
{
index=index+1;
while(index<=n)
{
BITREE[index]+=val;
index+=index&(-index);
}
}


public static void constructBITree(int[] arr,int n)
{
BITREE=new int[n+1];
  for(int i=0;i<n;i++)
    updateBIT(n,i,arr[i]);
}



public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("#################################");
int freq[]={2,1,1,3,2,3,4,5,6,7,8,9};
int n=12;
constructBITree(freq,n);

System.out.println("The sum of first 6 elements are  "+getSum(BITREE,5));

freq[3]+=6;
updateBIT(n,3,6);

System.out.println("The sum of first 6 elements after update are  "+getSum(BITREE,5));

}
}