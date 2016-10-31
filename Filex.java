
class Caller  implements Runnable
{
String msg;

Thread t;

public Caller(String s)
{
msg=s;
t=new Thread(this);
t.start();
}
public void run()
{
System.out.print("["+msg);
try{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println("Interrupted");
}
System.out.println("]");
}}
class Filex
{
public static void main(String args[])
{
Caller ob1=new Caller("Hello");
Caller ob2=new Caller("Synchronized");
Caller ob3=new Caller("World");

try
{
ob1.t.join();
ob2.t.join();
ob3.t.join();
}catch(InterruptedException e){
System.out.println("Interrupted");
}}}