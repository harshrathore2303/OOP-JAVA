package Concepts.Inheritance;

public class Inheritence {
    public static void main(String[] args) {
        // Inheritence: Inheritance can be an effective method to share code between classes that have some traits in common, yet allowing the classes to have some parts that are different.
            //  Vehicle
            //     |
            //  ---------
            //  |       |
            // Car    Truck


        // vist Box.java first, Boxweight.java
        // a class cannot inherit itself using extends keyword
    
        // types of inheritence
    
        // single inheritence: one class extends another class
        BoxPrice bb = new BoxPrice(400, 50, 100);   //side = 400, weight = 50, cost = 100
        // multilevel inheritence: one class extend another class which further extends
        // another class
    
        // multilevel inheritance: one class extends more than one classes
        // java doesnot support this.
        // but it can be implemented using interfaces
    
        // hierachial inheritance: one class is inherited by many classes
        // BoxColor and BoxPrice both inherit BoxWeight class therefore this follows the
        // concept of hierachail inheritance
    
        // hybrid inheritance: Combination of both multilevel and single inheritance
        // java doesnot support this
        // but can be used by using inheritance
    
        // a class can not inherit itself using extends keyword        
    }
}
