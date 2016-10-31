import java.net.*;

class Inet
{
public static void main(String args[]) {
try
{
InetAddress Address=InetAddress.getLocalHost();
System.out.println(Address);

Address=InetAddress.getByName("www.google.com");
System.out.println(Address);
}
catch(UnknownHostException e)
{
System.out.println("Google.com not found");
}}}