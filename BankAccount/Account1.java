import java.io.*;
import java.util.*;
class Bank
{
Scanner sc=new Scanner(System.in);
String name;
int accno;
String acc;
float balance;
void getdata(String n,int a,String c,float l)
{
System.out.println("\n Enter your name : ");
n=sc.nextLine();
System.out.println("\n Enter type of i.e. SAVINGS or CURRENT : ");
c=sc.nextLine();
System.out.println("\n Enter Account number : ");
a=sc.nextInt();
System.out.println("\n Enter Initial Balance : ");
l=sc.nextFloat();
name=n;
accno=a;
acc=c;
balance=l;
}
void deposit(float d)
{
System.out.println("\n Enter the amount to be Deposited : ");
d=sc.nextFloat();
balance=balance+d;
}
void withdraw(float w)
{
System.out.println("\n Enter the amount to be Withdrawed : ");
w=sc.nextFloat();
if(w<=balance)
{
balance=balance-w;
}
else
System.out.println("\n Insufficient Funds ");
}
void display()
{
System.out.println("\n Name of Account Holder : "+name+"\n Account no. : "+accno+"\n Type of Account : "+acc+"\n Balance = "+balance+"Rs.");
}
}
class Account1
{
public static void main(String args[])
{
int ch,a=0,t=4;
float d=0,w=0,l=0;
String n="null",c="null";
Scanner sc=new Scanner(System.in);
Bank b= new Bank();
System.out.println("\n Create a new Account ");
b.getdata(n,a,c,l);
while(t!=0)
{
System.out.println("\n 1. Deposit \n 2. Withdraw \n 3. Information on Account holder ");
System.out.println("\n Enter your choice : ");
ch=sc.nextInt();
switch(ch)
{
case 1:b.deposit(d);
	break;
case 2:b.withdraw(w);
	break;
case 3:b.display();
	break;
default:System.out.println("\n INVALID ");
}
t=t-1;
}
}
}