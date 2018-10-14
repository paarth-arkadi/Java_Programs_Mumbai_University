import java.io.*;
class Human
{

Human()
{
g="Boy";
System.out.println(g);
}
String g;
public void eat()
{
System.out.println("Human is eating");
}
}
class Boy extends Human
{
void disp()
{
super.eat();
}
public void eat()
{
System.out.println("Boy is eating");
}
public static void main(String args[])
{
Boy b=new Boy();
b.eat();
b.disp();
}
}

