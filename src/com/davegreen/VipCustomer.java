package com.davegreen;

/**
 * Created by daveg on 20/06/2017.
 */
public class VipCustomer
{
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer()
    {
        this("Default name", 0.00, "Default Email");
        System.out.println("Empty default constructor called");
    }

    public VipCustomer(String name, double creditLimit)
    {
        this(name, creditLimit, "Default Email");
        System.out.println("Constructor with 2 values and 1 default called");
    }

    public VipCustomer(String name, double creditLimit, String email)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Constructor with all fields saved called");
    }

    public String getName()
    {
        return name;
    }

    public double getCreditLimit()
    {
        return creditLimit;
    }

    public String getEmail()
    {
        return email;
    }
}
