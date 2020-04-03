public class YoutubePractice55StaticKeyword {
//OOP is all about creating classes, and then using instances of those classes (objects) to output something


    /*
    Lesson 55: Static
    When Static keyword is applied, two things happen:
    1. The variable or method its applied to can be interfaced with without declaring an object
        -you can put things within them before creating an object
    2. Sort of behaves as a global variable, thus enabling first occurrence listed right above this line
        -can come in handy if you have a variable that be unchanging for objects of a particular class
        (example in video is number of wings for aircraft, which is almost always 2)
     */

    public static void main(String[] args){
        //Lesson 55:
        staticKeywordLessonConstructor.wings = 2; //this is how you declare/initialize static variable, by calling on object name first
        //NOTE since above is static member variable, it can be declared (like here above) before below objects are created
        //Usually, this is not possible as objects have to be created first


        staticKeywordLessonConstructor cessna172 = new staticKeywordLessonConstructor(4, 140, 56.5, 9.5); //instantiating objects
        staticKeywordLessonConstructor piperSaratoga = new staticKeywordLessonConstructor(6, 201, 102.5, 20.5);


        //
        System.out.println("For Cessna172 to fly for 4.2 hours, it takes " + cessna172.fuelNeeded(4.2) + " gallons of fuel");
        System.out.println("For Saratoga to fly for 1.25 hours " + piperSaratoga.fuelNeeded(1.25) + " gallons of fuel");



        //have to modify private variable through method in the class it's in:
        cessna172.setPassengersMethodTwo(5); //SETTER
        //this is now being modified by method in class below



        System.out.println("All of my aircraft have " + staticKeywordLessonConstructor.wings + " wings");

        System.out.println(cessna172.wings); //printing number of wings for cessna
        System.out.println(piperSaratoga.wings); //printing number of wings for piper



        Math.cos(5.56); //Math is class; cos is method
        //How can we use this class's method if there's no object for it yet?
        //Because the method is marked as static
    }
}

class staticKeywordLessonConstructor {  //CLASS IS A TEMPLATE

    // For lesson 54: All things inside this class (variables, methods, etc),
    //they can have a keyword in front of it that's either public or private.
    //If nothing specified, default is public

    //PUBLIC: means fields can be accessed inside class and outside of it;
    //in either other classes, or other areas of your program

    //PRIVATE: means fields inside particular class can only be accessed within that class



    private int passengers;
    int cruiseSpeed;
    static double fuelCapacity;
    static double fuelBurnRate;
    static int wings;  //static means "unmoving" so idea is that it's sort of unchanging
    //this static var will apply to all objects of this class


    //constructor: (has to be same name as class)

    staticKeywordLessonConstructor(int p, int c, double fc, double fbr){ //these are named after member variables above
        passengers = p;
        cruiseSpeed = c;
        fuelCapacity = fc;
        fuelBurnRate = fbr;
    }



    //Lesson 55 content:
    //Static keyword can also be applied to methods:

    static double calculateEndurance() {   //type of method type has to match value type
        //not returning anything and not taking parameters
        double endurance;

        //the below variables (fuelCapacity and fuelBurnRate) will turn red and be inaccessible unless they're also static
        endurance = fuelCapacity / fuelBurnRate;

//        System.out.println("The endurance is " + endurance + " hours.");
        return endurance; //returning answer to where it was called from
    }


    //new method, but still in anotherAircraft class
    double fuelNeeded(double time){
        return fuelBurnRate * time;
    }

    //method to alter number of passengers without saturating main method too much
    void setPassengersMethodTwo(int p){
        if( (p > 0) && (p <=10)){
            passengers = p; //error checking for 1-10 passengers
            System.out.println("Revised passenger count: " + passengers);
        }
        else System.out.println("Error setting passengers");
    }
}
