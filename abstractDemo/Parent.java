package abstractDemo;

public abstract class Parent{
    int age;
    Parent(int age){
        this.age = age;
    }
    
    //we cannot create abstract static methods, abstract constructor
    static void hello(){
        System.out.println("Hello");
    }

    void greet(){ // Concrete (non-abstract) method
        System.out.println("Good Morning");
    }

    // abstract methods don't have implementation body
    abstract void career(); 
    abstract void partner(); 
}