package Generics;

import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i= 0; i < 5; i++){
            arr.add(i);
        }

        arr.forEach((item) -> {
            System.out.println(item);
        });

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LambdaFunctions myCalc = new LambdaFunctions();

        System.out.println(myCalc.operate(5, 3, sum));
        System.out.println(myCalc.operate(5, 3, prod));
        System.out.println(myCalc.operate(5, 3, sub));
    }

    int operate (int a, int b, Operation op){
        return op.Operation(a, b);
    }
}

interface Operation{
    int Operation(int a, int b);
}
