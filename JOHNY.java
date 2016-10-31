import java.io.*;
import java.util.*;
public class JOHNY
{
public static void main(String args[])throws IOException
{
InputStreamReader system=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(system);

int t=Integer.parseInt(br.readLine());
while(t-->0)
{
int tot=Integer.parseInt(br.readLine());

String[] tot_inp_string=br.readLine().split(" ");  //string  array for input


long[] tot_inp=new long[tot];                    //declaring numerical input array

for(int i=0;i<tot;i++)
{
tot_inp[i]=Long.parseLong(tot_inp_string[i]);      //getting in number.
}


long req= tot_inp[Integer.parseInt(br.readLine()) - 1];  //getting required number .  -1 because of 1 based index

Arrays.sort(tot_inp);
for(int i=0;i<tot;i++)
{
if(tot_inp[i]==req)
System.out.println((i+1));
}

}


}
}