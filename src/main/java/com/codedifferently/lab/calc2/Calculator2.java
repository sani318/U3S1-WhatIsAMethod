package com.codedifferently.lab.calc2;

public class Calculator2 {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0.0;

    public void findTotal(){
        double taxAmount= originalPrice * tax;
        double tipAmount=originalPrice * tip;
        //Calculate an individual's total after tax and tip
        double totalAmount = originalPrice + taxAmount +tipAmount;
        // print calc breakdown
        System.out.println("Original Price $" + originalPrice);
        System.out.println("tax: $" +taxAmount);
        System.out.println("tip $" +tipAmount);
        System.out.println("Total amount: $" +totalAmount);





        //Print this value


    }
}

