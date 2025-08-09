package Concepts.Polymorphism;

public class Shapes {
    //I made this function final and now this function cannot be overriden i.e. circle, triangle, sqaure will not change this and use this
    //early binding
    // final void area(){
    //     System.out.println("I am in shape");
    // }

    //late binding


    void area(){
        System.out.println("I am in shape");
    }
}
