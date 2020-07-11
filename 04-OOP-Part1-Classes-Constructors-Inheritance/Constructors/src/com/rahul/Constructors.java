package com.rahul;

public class Constructors {
    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the main balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.
    
//        Account bobsAccount = new Account("12345", 0.00, "Bob Brown",
//        "myemail@bob.com", "(087) 123-4567");
//        Account bobsAccount = new Account();
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(200.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
//        bobsAccount.setCustomerPhoneNumber("(007) 123-4567");
//        bobsAccount.withdrawal(100.0);
//        
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//        
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//        
        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
        System.out.println("Current balance is " + timsAccount.getBalance());
        timsAccount.withdrawal(100.55);

//    Create a new class VipCustomer
//    It should have 3 fields name, credit limit, and email address.
//    create 3 constructors
//    1st constructor empty should call the constructor with 3 parameters with default values
//    2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
//    3rd constructor should save all fields.
//    create getters only for this using code generation as setters won't be needed
//    test and confirm it works.

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());
        
        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());
        
        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
    
}
