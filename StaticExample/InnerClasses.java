package StaticExample;

//outside classes cannot be static
public class InnerClasses {
    static class A {
        String name;

        public A (String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        A a = new A("Harshit");

    }
}
