package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son ss = new Son(21);
        ss.career();
        Daughter dd = new Daughter(22);
        dd.greet();
        dd.career();
        Parent.hello(); // hello() is a static method
    }
}
