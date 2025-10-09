package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Always run");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        //throw is used to declare exceptions
        if (b == 0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}
