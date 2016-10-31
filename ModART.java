import java.util.*;

class MODART {
    public static void main(String args[] ) throws Exception {
	Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int mul=1;
       for(int i=0;i<n;i++)
       {
       mul=  (mul*sc.nextInt())%(int)((Math.pow(10,9)+7));
       }
       System.out.println(mul);
       
    }
}