package abstractDemo;

public class Son extends Parent {

    Son(int age) {
        super(age);
    }

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
