package com.codedifferently.lab.calc3;

public class CalculatorTest3 {
    public static void main(String[] args) {

        Calculator3 calc = new Calculator3();

        //Use the Calculator object and arguments supplied to findTotal()
        //to print the total for each person
        double pricePerson1=10.00;
        double pricePerson2=12.00;
        double pricePerson3 = 9.00;
        double pricePerson4 = 8.00;
        double pricePerson5 = 7.00;
        double pricePerson6 = 15.00;//a
        double pricePerson7 = 11.00;
        double pricePerson8 = 30.00;
        //names
        String person1 = "Person 1";
        String person2 = "Person 2";
        String person3 = "Person 3";
        String person4 = "Person 4";
        String person5 = "Person 5";
        String person6 = "Alex"; // Alex
        String person7 = "Person 7";
        String person8 = "Person 8";

        //findTotal
        calc.findTotal(pricePerson1);
        calc.findTotal(pricePerson2);
        calc.findTotal(pricePerson3);
        calc.findTotal(pricePerson4);
        calc.findTotal(pricePerson5);
        calc.findTotal(pricePerson6);
        calc.findTotal(pricePerson7);
        calc.findTotal(pricePerson8);






       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    }
}
