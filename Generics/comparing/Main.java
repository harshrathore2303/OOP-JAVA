package Generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static class Com implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            // TODO Auto-generated method stub
            return 0;
        }
    } 
    public static void main(String[] args) {
        Student kunal = new Student(12, 89.5f);
        Student rahul = new Student(15,98.5f);
        Student arpit = new Student(1,92.5f);
        Student karan = new Student(13,93.7f);
        Student sachin = new Student(21,77.6f);

        Student[] list = {kunal, rahul, arpit, karan, sachin};
        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks - o2.marks);
//            }
//        });
        //lambda expression
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));

        //java does not know how to compare these objects. java cannot get values for direct comparison until we use kunal.marks or rahul.marks
//        if (kunal.compareTo(rahul) < 0){
//            System.out.println("Rahul has more marks then kunal");
//        }

    }
}
