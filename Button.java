import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Button extends JFrame
{
  JButton b1;
  JTextField t1,t2;
  JLabel l1,l2,l3;
  public Button()
  { 
    setSize(500,500);
    setLocationRelativeTo(null);
    setLayout(null);
    l1=new JLabel("ENTER FIRST NUMBER:");
    l1.setBounds(50,50,150,30);
    add(l1);
    l2=new JLabel("ENTER SECOND NUMBER:");
    l2.setBounds(50,100,150,30);
    add(l2);
    t1=new JTextField();
    t1.setBounds(250,50,100,30);
    add(t1);
    t2=new JTextField();
    t2.setBounds(250,100,100,30);
    add(t2);
    l3=new JLabel("result");
    l3.setBounds(175,200,250,50);
    l3.setFont(new Font("magneto",0,20));
    add(l3);
    b1=new JButton("add");
    b1.setBounds(150,300,100,30);
    add(b1);
    b1.addActionListener(new AddListener());
    getContentPane().setBackground(new Color(150,200,255));
    setVisible(true);
  }
class AddListener implements ActionListener
{
  public void actionPerformed(ActionEvent evt)
{
   String x=t1.getText();
   String y=t2.getText();
   if(x.equals("")||y.equals(""))
   {
     JOptionPane.showMessageDialog(Button.this,"none");
     return;
   }
   int n1=Integer.parseInt(x);
   int n2=Integer.parseInt(y);
   int z=n1+n2;
   l3.setText(String.valueOf(z));
}
}
public static void main(String args[])
{  
   JFrame.setDefaultLookAndFeelDecorated(true);
   new Button();
}
  
}