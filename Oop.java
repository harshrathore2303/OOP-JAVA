public class Oop{
    public static void main(String[] args) {
        //primitive datatype are not objects that's why they are stored in stack, which is a memory region designed for fast allocation and deallocation.
        int a = 20;
        //objects are stored in heap memory
        Student kunal = new Student(25, "Kunal", new int[]{4,5,6,9});
        kunal.roll = 23;
        System.out.println(kunal.roll);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);   
        
        // kunal.changeName("Shoe lover");
        kunal.greeting();
        
        //passing object to constructor
        //new keyword is used to create the object of student
        //new allocates the new memory for kunal and returns a reference to kunal means form way from kunal to address, memory is allocated for it on the heap.
        //The stack stores a reference (a memory address) to the object in the heap.
        Student random = new Student(kunal);
        System.out.println(random.name);

        //calling constructor from constructor
        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Harry";
        System.out.println(two.name); //output Harry
        
    }
}

class Student {
    int roll;
    String name;
    int[] marks;

    void greeting(){
        System.out.println("My name is " + this.name);
    }

    void changeName(String newName){
        this.name = newName;
    }

    //constructor overloading
    Student(Student other){
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks;
    }

    Student(){
        //internally: this will call Student(11, "Random", new int[]{})
        this (11, "Random", new int[]{});
    }    
    
    
    Student(int roll, String name, int[] marks){
        //here this is referencing kunal or we can say 'this' will reference the object that is created using Student class
        //'this' cannot be used inside static methods because this refers to the current object’s reference — but a static method runs without any object, so there is no this to refer to.
        // System.out.println(this);
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }    
}