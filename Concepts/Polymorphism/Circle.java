package Concepts.Polymorphism;

public class Circle extends Shapes {
    // this will run when obj of circle is created 
    // hence it is overriding the parent method
    @Override //this is called annotation
    void area(){
        System.out.println("I am in  3.14 * r ^ 2");
    }
}
