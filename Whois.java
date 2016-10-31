import java.net.*;
import java.io.*;
public class Whois
{
public static void main(String args[]) {
try
{
int c;
{
Socket s=new Socket(args[0],80);



if(s.getInetAddress()==null)
System.out.println(args[0]+"NOT alive");
else 
System.out.println("Ready to play with "+args[0]);


s.close();
}}
catch(Exception e)
{
System.out.println("Not Found");
}


}
}