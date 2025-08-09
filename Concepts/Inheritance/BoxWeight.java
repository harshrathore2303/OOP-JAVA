package Concepts.Inheritance;

public class BoxWeight extends Box {
    double weight;

    //this class will not be able the use variables that are private in parent class

    //constructor
    public BoxWeight(){
        this.weight = -1;
        
        //not accessible as it is private
        // System.out.println(this.l);
        
        //accessible as it is public
        // System.out.println(this.h);
    }
    
    public BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double l, double w, double h, double weight){
        super(l, h, w); //this is just calling the parent class constructor, used to initialize values in parent class
        
        // super.weight is used to access the weight from parent class if parent class has weight property.
        // If i used this.weight then this will give me weight from this class but i wanted weight from above class thats why is used super.weight.

        // System.out.println(super.weight);
        this.weight = weight;
    }

    public BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
}
