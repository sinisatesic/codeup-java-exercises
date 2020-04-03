import java.sql.SQLOutput;

public class YoutubePractice54PublicAndPrivateAccessModifiers {

    public static void main(String[] args){
        publicAndPrivateAccessConstructor cessna172 = new publicAndPrivateAccessConstructor(4, 140, 56.5, 9.5); //instantiating objects
        publicAndPrivateAccessConstructor piperSaratoga = new publicAndPrivateAccessConstructor(6, 201, 102.5, 20.5);


        //
        System.out.println("For Cessna172 to fly for 4.2 hours, it takes " + cessna172.fuelNeeded(4.2) + " gallons of fuel");
        System.out.println("For Saratoga to fly for 1.25 hours " + piperSaratoga.fuelNeeded(1.25) + " gallons of fuel");

        //Lesson 54 content:
        //(BELOW DOESN'T WORK AFTER VAR PASSENGERS IS MADE PRIVATE!
//        cessna172.passengers = 10; //putting new value to passengers
//        //prior to this point, constructor had set it to 4
//        //the reason this variable is able to be modified like this is because variable is public
//        //if this member variable (passengers) is set to private in below class, it will not be visible outside of that class!
//        System.out.println("Cessna revised passengers: " + cessna172.passengers);

        //have to modify private variable through method in the class it's in:
        cessna172.setPassengersMethodTwo(5); //SETTER
        //this is now being modified by method in class below
    }
}

class publicAndPrivateAccessConstructor {  //CLASS IS A TEMPLATE

    // For lesson 54: All things inside this class (variables, methods, etc),
    //they can have a keyword in front of it that's either public or private.
    //If nothing specified, default is public

    //PUBLIC: means fields can be accessed inside class and outside of it;
    //in either other classes, or other areas of your program

    //PRIVATE: means fields inside particular class can only be accessed within that class



    private int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;


    //constructor: (has to be same name as class)

    publicAndPrivateAccessConstructor(int p, int c, double fc, double fbr){ //these are named after member variables above
        passengers = p;
        cruiseSpeed = c;
        fuelCapacity = fc;
        fuelBurnRate = fbr;
    }


    //method to calculate aircraft endurance

    double calculateEndurance() {   //type of method type has to match value type
        //not returning anything and not taking parameters
        double endurance;

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
