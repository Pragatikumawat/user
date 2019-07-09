import java.awt.*;
import java.awt.event.*;
class Window extends Frame implements ItemListener
{
private Checkbox c1,c2;
private TextField t1;
public Windemo()
{
setSize(300,300);
setTitle("eg of events");
t1=new TextField(6);
c1=new checkbox("bold");
c2=new checkbox("italic");
GridLayout g=new GridLayout(3,1);
setLayout(g);
add(t1);
add(t2);
c1.addItemListener(this);
c2.addItemListener(this);
setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{
if(e.getSource()==c1)
{
if(c1.getState()==true)
{
if(c2.getState()==true)
{
Font  f=new Font("Arial",Font.Bold+Font.ITALIC,30);
t1.setFont(f);
}
}
else if(e.getSource()==c2)
{
if(c2.getState()==true)
{
if(c1.getState()==true)
{
Font f=new Font("arial",Font.BOLD+Font.ITALIC,30);
t1.setFont(f);
}
else
{
Font f=new Font("arial",Font.ITALIC,30);
t1.setFont(f);
}
}
else
{
Font f=new Font("arial",Font.PLAIN,30);
t1.setFont(f);
}
}
else
{
Font f=new Font("arial",Font.PLAIN,30);
t1.setFont(f);
}
}
else if(e.getSource()==c2)
{
if(c2.get.State()==true)
{
if(c1.get.State()==true)
{
Font f=new Font("arial",Font.BOLD+Font.ITALIC,30);
t1.setFont(f);
}
else
{
Font f=new Font("arial",Font.ITALIC,30);
t1.setFont(f);
}
}
else{
Font f=new Font("arial",Font.PLAIN,30);
t1.setFont(f);
}
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