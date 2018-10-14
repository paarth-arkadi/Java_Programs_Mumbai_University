import java.io.*;
import java.util.*;
public class switcing
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);// object sc is declared of scanner class
int a,i,t1=0,t2=1,n,sum=0,b=0,rev=0,f=1,c=0,ch=4;
while(ch!=0)// loops run 4 times 
{
System.out.println("\n 1. Factorial \n 2. Fibonacci \n 3. Palindrome \n 4. Floyds");
System.out.println("\n Enter your choice");
a = sc.nextInt();// takes conditional expression and stores it in variable a
switch(a)// conditional expression
{
case 1:
	System.out.println("Enter number: ");
	n = sc.nextInt();
	for(i=1;i<=n;i++)// loop to find a factorial
	{
	f=i*f;
	}
	System.out.println("Factorial of the number is"+f);
	break;
case 2:       System.out.print("Enter no. of terms: ");
	n = sc.nextInt();
	for (i = 1; i <= n; i++)// loop to form fibonacci series
	{
	System.out.print(t1 + " ,  ");
	sum = t1 + t2;
	t1 = t2;
	t2 = sum;
	}
	break;
case 3:	System.out.println("Enter the number: ");
	n = sc.nextInt();
	c=n;
	while(n!=0)// loop to find reverse of a number
	{	
	b=n%10;
	rev=rev*10+b;
	n=n/10;
	}
	if(rev==c)// checks whether the number is a palindronme or not
	{
	System.out.println("The number is a Palindrome");
	}
	else
	System.out.println("The number is not a Palindrome");
	break;
case 4:
    int n1,r1,i1,j1=1;
    System.out.println("Enter no. of rows : ");
    n1 = sc.nextInt();// no. of rows is being inputted
    System.out.println(" Floyds triangle of "+n1+" rows : ");
    for(r1=1;r1<=n1;r1++)
    { 
	for(i1=1;i1<=r1;i1++)// loop will run the same times as that of row number
	{
	System.out.print(" "+j1);
	j1++;// increment in value of elements
	}
	System.out.print("\n");
    }
    break;
default:	System.out.println("INVALID");
}
ch=ch-1;
}
}
}
