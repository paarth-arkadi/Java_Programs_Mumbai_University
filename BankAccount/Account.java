// This program is used to create a bank account class which contains the following methods:
// 1. getData : Which takes the following data - Name,Savings or Current,Account Number,Initial Balance
// 2. deposit: takes in the amount to be deposited and adds it to the balance
// 3. withDraw : takes in the amount to be withdrawn and deducts it from the balance if there is sufficient balance
// 4. display : Displays the name of account holder , account number , type of account and balance in rs.
// 5. verifyPin : Takes in the pin and returns true if pin is verified.
// 6. changePin : takes in the old pin and new pin , if old pin is verified then changes the oldPin wiht newPin or else returns.
// *This program demonstrates the use of Java in atm's

import java.io.*;
import java.util.Scanner;

class Bank{
    int oldPin;  // Stores the pin 
    String accName; // Name of the account holder
    String accType; // Type of account
    long  accNo; // The account number
    long  balance; // Stores the balance
    
    void getData(int oldPin,String accName,String accType,long  accNo,long  balance){
        // This function initally inputs the data from the user itself
        oldPin = oldPin;
        accName = accName;
        accType = accType;
        accNo = accNo;
        balance = balance;
    }

    void display()
    {
       // System.out.println("Your Pin is: " +oldPin); // Not to display the pin
        System.out.println("Your acc Name is: " +accName);
        System.out.println("Your accType is: " +accType);
        System.out.println("Your accNo is: " +accNo);
        System.out.println("Your accbalance is: " +balance);
    }

    void deposit(long depositAmount)
    {
      balance = balance + depositAmount;
      System.out.println(depositAmount +" Has been credited into your account" + "Your new balance is: "+balance);
    }

    void withDraw(long withDrawAmount)
    {
        if(balance>=withDrawAmount)
        {
            balance = balance - withDrawAmount;
            System.out.println(withDrawAmount +" Has been debited form your account " + " Your new balance is " +balance);
        }
        else{
            System.out.println("Insufficent Funds");
            System.out.println("Your balance is: " +balance);
        }
    }

    boolean verifyPin(int oldPin)
    {
        if(oldPin==oldPin)
        {
            return true;
        }
        else{
            return false;
        }
    }

    void changePin(int oldPin , int newPin)
    {
        boolean checkPin; // This variable is used to store the values of the verify pin returning true or false
        Bank b = new Bank(); // Creates an object of Bank class 
        checkPin = b.verifyPin(oldPin); // the methods returns true or false dependsing on wheter the pin is right or wrong.
        if(checkPin)
        {
            b.oldPin = newPin;
        }
        else{
            System.out.println("The pin you entered is wrong");
        }

    }

}

public class Account{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the following details:");
        System.out.println("Account Name: ");
        String accName = sc.nextLine();
        System.out.println("Account Numer: ");
        long  accNumber = sc.nextLong();
        System.out.println("Account Tpye");
        String accType = sc.nextLine();
        System.out.println("Account Balance: ");
        long  balance = sc.nextLong();
        System.out.println("Enter your pin: ");
        int oldPin = sc.nextInt();
        while(true)
        {   Bank b = new Bank();
            b.getData(oldPin,accName,accType,accNumber,balance);
            b.display();
            boolean checkPin = false;
            System.out.println("In order to do any transcation pls enter the pin");
            int pin = sc.nextInt();
            checkPin = b.verifyPin(pin);
            if(!checkPin)
            {   System.out.println("You entered wrong pin");
                continue;
            }
            System.out.println("Please select any of the below options");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Change Pin");
            System.out.println("4. Exit");
            int option = sc.nextInt();
            long  amount = 0;
            int enterOldPin = 0;
            int enterNewPin = 0;
            boolean wantToExit = false;
            switch(option){
                case 1:
                System.out.println("Enter the amount to withdraw");
                amount = sc.nextLong(); 
                b.withDraw(amount);
                break;
                case 2:
                System.out.println("Enter the amount to deposit");
                amount = sc.nextLong(); 
                b.deposit(amount);
                break;
                case 3:
                System.out.println("Enter the old pin and enter new pin");
                enterOldPin = sc.nextInt();
                enterNewPin = sc.nextInt(); 
                b.changePin(enterOldPin,enterNewPin);
                break;
                case 4:
                wantToExit = true; 
                break;
                default:
                System.out.println("Inavalid token");
                break;

            }
            if(wantToExit)
            {
                break;
            }

        }
        System.out.println("Transctions completed and succesfully exited");
        sc.close();
    }
}