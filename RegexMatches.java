import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches
{
public static void main(String args[])
{
String line="This was mistaken to be found as File.jpg";
String pattern="(.*)";
Pattern r=Pattern.compile(pattern);
Matcher m=r.matcher(line);
if(m.find())
System.out.println("Found value:"+m.group(0));
else
System.out.println("Not found");
}
}