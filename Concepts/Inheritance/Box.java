package Concepts.Inheritance;

public class Box {
    private double l; //only in this file
    double w;
    double h;

    Box() {
        // there is no sense to use super class in parent class because it does not have any immediate parent
        super();
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box (double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    //cuboid
    Box (double l, double w, double h) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box (Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    public void information() {
        System.out.println("Running the box");
    }
}
