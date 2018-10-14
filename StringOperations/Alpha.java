import java.io.*;
import java.util.Scanner;
class Alpha
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=6,ch,p;
String s1,s2,s0;
while(n!=0){
System.out.println("1. Conversion into lowercase and uppercase ");
System.out.println("2. Replacing appearances ");
System.out.println("3. Comparing 2 strings ");
System.out.println("4. Derivation of substring ");
System.out.println("5. Finding position of a character ");
System.out.println("6. Finding a character ");
System.out.println("Enter your choice :");
ch=sc.nextInt();
System.out.println("Enter the string : ");
s1=sc.next();
switch(ch)
{
case 1:
	System.out.println("Lower and uppercase string is:");
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());
    break;
case 2:
	System.out.println("String after replacing 'l' with 'j': " + s1.replace('l', 'j'));
    break;
case 3:
    System.out.println("Enter the string to be compared : ");
	s2=sc.next();
	System.out.println(s1.equals(s2));
    break;
case 4:
	System.out.println(s1.substring(7));
	System.out.println(s1.substring(0,7));
    break;
case 5:
    System.out.println("Enter the character to find out its index number in the string");
    char ch1 = sc.next().charAt(0);
	int index1=s1.indexOf(ch1);
	System.out.println("Position of character is : ");  
	System.out.println(index1+1);
    break;
case 6:
	System.out.println("Enter the position of the character : ");
	p=sc.nextInt();
    p=p-1;
	System.out.println("The character is : ");
	System.out.println(s1.charAt(p));
    break;
default:System.out.println("INVALID");
break;
}
n=n-1;
}
}

}