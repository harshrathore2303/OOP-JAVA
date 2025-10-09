package enumExample;

public class Basic {
    //cannot extends anything but we can implement interfaces here
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //these are enum constants
        //public, static and final
        //since its final you cannot create child enums
        //type is week


        Week() {
            System.out.println("Constructor called for " + this);
        }

        //this is not public or protected, only private or default
        //why?
        //we dont want to create new objects
        //this is not the enum concepts, thats why

        //internally: public static final  Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for (Week day : Week.values()){
            System.out.println(day);
        }

        System.out.println(week.ordinal());
    }
}
