import javax.swing.*;

public class SwingDemo
{
SwingDemo()
{
JFrame jfrm=new JFrame("This is Swing Application");

jfrm.setSize(100,100);

jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel jlb=new JLabel("This is Demo");

jfrm.add(jlb);

jfrm.setVisible(true);

}

public static void main(String args[])
{
SwingUtilities.invokeLater(new Runnable() { public void run()
{
new SwingDemo();
}
});
}
}