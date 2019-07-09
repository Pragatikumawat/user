import javax.swing.*;
class Demo{

public static void main(String args[])
{
int arr[]=new int [20];
int i,sum=0;
for(i=0;i<=19;i++)
{
arr[i]=Integer.parseInt(JOptionPane.showInputDialog("ENTER A NO."));
sum=sum+arr[i];
}
System.out.println("sum is:"+sum);
}
}