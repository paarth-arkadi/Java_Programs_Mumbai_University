import java.util.*;
class oddeven extends Thread
{
	Scanner sc=new Scanner(System.in);
	public void run()
	{
	System.out.println("Enter number:");
	long num=sc.nextLong();
	if(num%2==0)
	{
		System.out.println("Number is even");
	}
	else
	{
		System.out.println("Number is odd");
	}
	try
	{
	sleep(1000);
	}
	catch(Exception e)
	{
	}
	}
}
class Palindrome extends Thread
{
	Scanner sc=new Scanner(System.in);
	public void run()
	{
	int n,b=0,rev=0,c=0;
	System.out.println("Enter the number: ");
	n = sc.nextInt();
	c=n;
	while(n!=0)
	{	
	b=n%10;
	rev=rev*10+b;
	n=n/10;
	}
	if(rev==c)
	{
	System.out.println("The number is a Palindrome");
	}
	else
	System.out.println("The number is not a Palindrome");
	
	try
	{
	sleep(1000);
	}
	catch(Exception e)
	{
	}
	}
}
class Fibo extends Thread
{
	Scanner sc=new Scanner(System.in);
	public void run()
	{
	int n,i,t1=0,t2=1,sum=0;
	System.out.print("Enter no. of terms: ");
	n = sc.nextInt();
	for (i = 1; i <= n; i++)
	{
	System.out.print(t1 + "   ");
	sum = t1 + t2;
	t1 = t2;
	t2 = sum;
	}
	try
	{
	sleep(1000);
	}
	catch(Exception e)
	{
	}
	}
}
class abc
{
	public static void main(String args[]) throws InterruptedException
	{
		oddeven a=new oddeven();
		Palindrome b=new Palindrome();
		Fibo c=new Fibo();
		a.start();
		a.join();
		b.start();
		b.join();
		c.start();
	}
}