import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="Calculator" width=200 height=110>
</applet>
*/

public class Calculator extends Applet implements ActionListener
{
float num1=0,num2=0;
Character sym=0;
String Out=" ";
Label output=new Label("Output");

public void init()
{
add(output);
setLayout(new GridLayout(6,3));
Button p1=new Button("1");
Button p2=new Button("2");
Button p3=new Button("3");
Button p4=new Button("4");
Button p5=new Button("5");
Button p6=new Button("6");
Button p7=new Button("7");
Button p8=new Button("8");
Button p9=new Button("9");
Button p0=new Button("0");
Button plus =new Button("+");
Button minus=new Button("-");
Button mult=new Button("*");
Button div=new Button("/");
Button equals=new Button("=");
Button reset=new Button("Reset");
add(p1);
add(p2);
add(p3);
add(p4);
add(p5);
add(p6);
add(p7);
add(p8);
add(p9);
add(p0);
add(plus);
add(minus);
add(mult);
add(div);
add(equals);
add(reset);
p1.addActionListener(this);
p2.addActionListener(this);
p3.addActionListener(this);
p4.addActionListener(this);
p5.addActionListener(this);
p6.addActionListener(this);
p7.addActionListener(this);
p8.addActionListener(this);
p9.addActionListener(this);
p0.addActionListener(this);
plus.addActionListener(this);
minus.addActionListener(this);
mult.addActionListener(this);
div.addActionListener(this);
equals.addActionListener(this);
reset.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();

float res=0;
Character c=str.charAt(0);

if(Character.isDigit(c))
{
if(sym==0)
{
num1=num1*10+Integer.parseInt(str);Out=""+num1;
}
else
{
num2=num2*10+Integer.parseInt(str);Out=""+num2;
}
}
if(c=='R')
{
sym=0;
num1=num2=0;
Out="RESET";
}
if(c=='+'||c=='-'||c=='*'||c=='/')
{
sym=c;
Out=""+c;
}

if(c=='=')
{
if(sym=='+')
{
res=num1+num2;
}
else if(sym=='-')
{
res=num1-num2;
}
else if(sym=='*')
{
res=num1*num2;
}
else if(sym=='/')
{
res=num1/num2;
}
Out=""+res;
num1=res;
sym=0;
num2=0;
}

output.setText(Out);                   
repaint();
}

}