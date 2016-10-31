import java.io.*;
import java.util.*;
class COUNTWAY
{

static double nCr(int n, int r){
		int rfact=1, nfact=1, nrfact=1,temp1 = n-r ,temp2 = r;
		if(r>n-r)
		{
			temp1 =r;
			temp2 =n-r;
		}
		for(int i=1;i<=n;i++)
		{
			if(i<=temp2)
			{
				rfact *= i;
				nrfact *= i;
			}
			else if(i<=temp1)
			{
				nrfact *= i;
			}
			nfact *= i;
		}
		return nfact/(double)(rfact*nrfact);
	}



public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String[] line=br.readLine().split(" ");
int n=Integer.parseInt(line[0]);
int k=Integer.parseInt(line[1]);

HashSet<Integer> set=new HashSet<Integer>();

String[] line2=br.readLine().split(" ");
int Ar[]=new int[n];
for(int i=0;i<n;i++)
{
Ar[i]=Integer.parseInt(line2[i]);
set.add(Ar[i]);
}

int type=set.size();

int upper=k+type-1;
int lower=type-1;

System.out.println((int)nCr(upper,lower));

}
}