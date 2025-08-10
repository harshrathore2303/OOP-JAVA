package abstractDemo;

// The type Son must implement the inherited abstract method Parent.career()
// The type Son must implement the inherited abstract method Parent.partner()
// Implicit super constructor Parent() is undefined for default constructor. Must define an explicit constructor
public class Son extends Parent {

    Son(int age) {
        super(age);
    }

    // this method is not abstract so this will work if we don't override them
    @Override
    void greet(){
        System.out.println("");
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Poppins");
    }

}
