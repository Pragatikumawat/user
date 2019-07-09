class Abc{
public void add(int a, double b)
{
double ans;
ans=a+b;
System.out.println("addn of two no is:"+ans);
}
public void add(double a, int b)
{
double ans;
ans=a+b;
System.out.println("addn of two no is:"+ans);
}
}
class Demo
{
public static void main(String args[])
{
Abc obj=new Abc();
obj.add(10,20.5);
obj.add(10.2,20);
}
}