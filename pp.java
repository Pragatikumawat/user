import javax.swing.*;
class Bank
{
public int accno;
private String name;
private double open_bal,total_bal;
public void getData()
{
accno=Integer.parseInt(JOptionPane.showInputDialog("enter acc no"));
name=Integer.parseInt(JOptionPane.showInputDialog("enter name"));
open_bal=Double.parseDouble(JOptionPane.showInputDialog("enter opening balance"));
total_bal=open_bal;
}
public void showData()
{
System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
System.out.println("acc no:"+accno);
System.out.println("customer name"+name);
System.out.println("opening balance:"+open_bal);
System.out.println("total balance:"+total_bal);
System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
}
public void deposite()
{
double amount;
amount=Double.parseDouble(JOptionPane.showInputDialog("enter amount to deposite"));
total_bal=total_bal+amount;
System.out.println("successfully deposited");
System.out.println("|||||||||||||||||||||||||||||||||||||||");
}
public void withdraw()
{
double amount;
amount=Double.parseDouble(JOptionPane.showInputDialog("enter amount to withdraw"));
if((total_bal-amount)>1000)
{
total_bal=total_bal-amount;
System.out.println("successfully withdraw");
System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
}
else
{
JOptionPane.showMessageDialog(null,"you have not suffiecient balance");
}
}
public void update()
{
string nm;
nm=JOptionPane.showInputDialog("enter new name");
name=nm;
JOptionPane.showMessageDialog(null,"successfuly updated");
}
class Demo
{
public static void main(String args[])
{
Bank obj[]=new Bank[3];
int choice,i,counter=-1;
for(i=0;i<=2;i++)
{
obj[i]=new Bank();
}
while(true)
{
System.out.println("enter 1 to open account");
System.out.println("enter 2 to show all account");
System.out.println("enter 3 to search an account");
System.out.println("enter 4 to deposite");
System.out.println("enter 5 to withdraw");
System.out.println("enter 6 to update");
System.out.println("enter 7 to exit");
choice=Integer.parseInt(JOptionPane.showInputDialog("enter ur choice"));
switch(choice)
{
case1:
if(counter==2)
{
JOptionPane.showMessageDialog(null,"overflow condition");
}
else
{
counter++;
obj[counter].getData();
}
break;

case2:
if(counter=-1)
{
JOptionPane.showMessageDialog(null,"underflow condition");
}
else
{
for(i=0;i<=counter;i++)
{
obj[i].showData();
}
}
break;
case3:
if(counter==-1)
{
JOptionPane.showMessageDialog(null,"underflow condition");
}
else
{
int ano;
int loc=-1;
ano=Integer.parseInt(JOptionPane.showInputDialog("enter account to search"));
for(i=0;i<=counter;i++);
{
if(obj[i].accno==ano)
{
loc=1;
obj[i].showData();
break;
}
}
if(loc==-1)
{
JOptionPane.showMessageDialog(null,"not found");
}
}
break;
case4:
if(counter==-1)
{
JOptionPane.showMessageDialog(null,"underflow condition");
}
else
{
int ano;
int loc=-1;
ano=Integer.parseInt(JOptionPane.showInputDialog("enter account no"));
for(i=0;i<=counter;i++);
{
if(obj[i].accno==ano)
{
loc=1;
obj[i].deposit();
break;
}
}
if(loc==-1)
{
JOptionPane.showMessageDialog(null,"not found");
}
}
break;
case5:
if(counter==-1)
{
JOptionPane.showMessageDialog(null,"underflow condition");
}
else
{
int ano;
int loc=-1;
ano=Integer.parseInt(JOptionPane.showInputDialog("enter account no"));
for(i=0;i<=counter;i++);
{
if(obj[i].accno==ano)
{
loc=1;
obj[i].withdraw();
break;
}
}
if(loc==-1)
{
JOptionPane.showMessageDialog(null,"not found");
}
}
break;
case6:
if(counter==-1)
{
JOptionPane.showMessageDialog(null,"underflow condition");
}
else
{
int ano;
int loc=-1;
ano=Integer.parseInt(JOptionPane.showInputDialog("enter account no"));
for(i=0;i<=counter;i++);
{
if(obj[i].accno==ano)
{
loc=1;
obj[i].update();
break;
}
}
if(loc==-1)
{
JOptionPane.showMessageDialog(null,"not found");
}
}
break;
case7:
System.exit(1);
default:
System.out.println("invalid choice");
}
}
} 

