package cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human harsh = new Human(19, "Harsh");
//        Human twin = new Human(harsh);

        Human twin = (Human)harsh.clone();
        System.out.println(twin.age + " " + twin.name);

        //shallow copy and deep copy
    }
}
