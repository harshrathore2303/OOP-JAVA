package Concepts.Inheritance;

public class Main {
    //we can not access the private members of the any class
    public static void main(String[] args) {
        // Box box = new Box(4);
        // System.out.println(box.l);
        // System.out.println(box.w);
        // System.out.println(box.h);
        
        BoxWeight boxw = new BoxWeight(4, 5, 4, 25);
        System.out.println(boxw.weight);
//         System.out.println(boxw.l);
        System.out.println(boxw.h);
        System.out.println(boxw.w);

        //here boxweight class knows what this box contains that is why obj is created but this obj cannot access boxweight class variables
        Box box1 = new BoxWeight(4,5,6,8);

        //here error is because Box class doesnot have idea what boxWeight class contains
        // BoxWeight boxw1 = new Box();

        BoxPrice box = new BoxPrice();

        //single level inheritance
        BoxPrice bb = new BoxPrice(400, 50, 100); //side = 400, weight = 50, cost = 100

        //multilevel inheritance:- one class extends more than one classes
        //java doesnot support this.
        //but it can be implemented using interfaces
        
        //hierachial inheritance:- one class is inherited by many classes
        //BoxColor and BoxPrice both inherit BoxWeight class therefore this follows the concept of hierachail inheritance

        //hybrid inheritance:- Combination of both multilevel and single inheritance
        //java doesnot support this
        //but can be used by using inheritance

        //a class can not inherit itself using extends keyword

    }
}
