import java.awt.*;
import java.awt.event.*;
class Windemo extends Frame implements ItemListener
{
private TextField t1;
private Checkbox b1,b2,b3;
private CheckboxGroup cbg;
public Windemo()
{
setSize(300,300);
setTitle("eg of event handling of radio button");
t1=new TextField(6);
cbg=new CheckboxGroup();
b1=new Checkbox("red");
b2=new Checkbox("green");
b3=new Checkbox("blue");
GridLayout g=new GridLayout(4,1);
setLayout(g);
add(t1);
add(b1);
add(b2);
add(b3);
b1.addItemListener(this);
b2.addItemListener(this);
b3.addItemListener(this);
setVisible(true);

}
public void itemStateChanged(ItemEvent e)
{
Font f=new Font("arial",Font.BOLD,30);
t1.setFont(f);
if(b1.getState()==true)
{
t1.setForeground(Color.red);
}
else if(b2.getState()==true)
{
t1.setForeground(Color.green);
}
else if (b3.getState()==true)
{
t1.setForeground(Color.blue);
}
else 
{
t1.setForeground(Color.black);
}
}
}
class Demo
{
public static void main(String args[])
{
Windemo obj=new Windemo();
}
}