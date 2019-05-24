package com.davegreen;

/**
 * Created by daveg on 20/06/2017.
 */
public class Account
{
    private int number;
    private double balance;
    private String name;
    private String contactEmail;
    private String contactPhone;

    // Constructor was not part of the challenge and was something extra explained by Tim
    // This challenge was passed successfully during the repeating of all of the OOP lessons.

    public Account()
    {
        this(000000, 500.00, "Default name", "Default Emai", "Default Contact Number");
        System.out.println("Empty constructor called");
    }

    // Again this is another constructor used in Tims explanations just to explain how to set
    // all the fields above without having to use the setters that are in the main class, these
    // fields would be set as parameters in the constructors parenthesis and then defined as arguments
    // when calling the constructor, removing the need to use setters for this purpose.

    public Account(int number, double balance, String name, String contactEmail, String contactPhone)
    {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;

        System.out.println("Account constructor with parameters called");
    }

    public void depositFunds(double depositAmount)
    {
        this.balance += depositAmount;
        System.out.println("You have deposited " + depositAmount + " and your new balance is " + this.balance);
    }

    public void withdrawFunds(double withdrawalAmount)
    {
        if (withdrawalAmount > this.balance)
        {
            System.out.println("You have insufficient funds available your balance currently stands at " + this.balance);
        }
        else
        {
            this.balance -= withdrawalAmount;
            System.out.println("You have withdrawn " + withdrawalAmount + " and your new balance is " + this.balance);
        }
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getContactEmail()
    {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail)
    {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone()
    {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone)
    {
        this.contactPhone = contactPhone;
    }
}
