import java.io.*;
import java.util.Scanner;
class employee
{
public void calcsalary()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of working days ");
w=sc.nextInt();
d=100;
c=w*10;
s=d+c;
}
int d,w,c,s;
}
class manager extends employee
{
void total()
{
super.calcsalary();
Scanner sc=new Scanner(System.in);
int add;
System.out.println(" Add incentives for manager");
add=sc.nextInt();
s=s+add;
System.out.println("Total salary of Manager "+s);
}
}
class worker extends employee
{
void total()
{
super.calcsalary();
System.out.println("Total salary of Worker "+s);
}
}
class Salary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
manager m = new manager();
worker k = new worker();
m.total();
k.total();
}
}
