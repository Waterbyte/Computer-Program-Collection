import java.util.*;
public class Main4
{
public static int v=0;
public static int check(String s, int i, int j)
{
if(i>=j)
return 0;
else if(s.charAt(i)==s.charAt(j))
{
return check(s,i+1,j-1);
}
else if(s.charAt(i)!=s.charAt(j)){
   return   Math.min(check(s,i+1,j),check(s,i,j-1))+1;
}
return 0;
}




public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int num=sc.nextInt();
String s="";
sc.nextLine();
for(int i=0;i<num;i++)
{
s=s+sc.next();
}

v=check(s,0,(s.length()-1));
System.out.println(v);
}


}


}