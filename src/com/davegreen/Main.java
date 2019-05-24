package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        Account account = new Account();

        System.out.println(account.getBalance());


        account.depositFunds(100);
        account.withdrawFunds(50);
        account.withdrawFunds(48);

        // Setters and getter were never really used but if you were to use them it would be as such

        account.setBalance(1000.00);
        account.setNumber(123456);
        account.setContactEmail("davesAccount@banking.com");
        account.setContactPhone("12345_123");
        account.setName("Daves Account");

        // If we now repeat the deposit and withdrawal commands from above you will see that we
        // are starting from a balance of 1000.00 not 0.00.

        account.depositFunds(100);
        account.withdrawFunds(50);
        account.withdrawFunds(48);

        // If we now create a new account object but this time define all the arguments this will
        // set all of these fields in the account class the the values defined.

        Account secondAccount = new Account();//(987654, 2000.00, "daves second account", "davesEmail@mail.com", "123_456");        // This could be used to define all of the values as arguments.

        System.out.println(secondAccount.getBalance());     // The new Account() constructor method call above outputs all of the default
                                                            // values as defined in the empty constructor in the account class.
        // Now again if we now repeat the deposit and withdrawal commands from above but using the secondAccount
        // you will see that we are starting from a balance of 2000.00 not 1000.00 or even 0.00.

        secondAccount.depositFunds(100);
        secondAccount.withdrawFunds(50);
        secondAccount.withdrawFunds(48);


        // Challenge

        VipCustomer vipCustomer = new VipCustomer();            // This as an empty constructor which calls the default values as defined in the VipCustomer class.
        System.out.println(vipCustomer.getName());
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getEmail());

        VipCustomer vipCustomer1 = new VipCustomer("Daves VIP account", 1000.00);           // This is a constructor with 2 values defined and 1 passed as the default.
        System.out.println(vipCustomer1.getName());
        System.out.println(vipCustomer1.getCreditLimit());
        System.out.println(vipCustomer1.getEmail());

        VipCustomer vipCustomer2 = new VipCustomer("Stacy's VIP account", 2000.00, "stacyEmail@mail.com");      // This is a constructor with all values defined in the arguments.
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getCreditLimit());
        System.out.println(vipCustomer2.getEmail());
    }
}
