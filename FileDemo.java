import java.io.*;
public class FileDemo
{
public static void main(String args[])
{

try
{
int i=0;
FileInputStream fin=new FileInputStream(args[0]);

do
{
i=fin.read();
if(i!=-1)
System.out.print((char)i);
}
while(i!=-1);



fin.close();

}catch(Exception e)
{
System.out.println("Exception in program");
}
}
}