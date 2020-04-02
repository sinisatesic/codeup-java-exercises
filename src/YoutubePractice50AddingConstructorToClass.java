public class YoutubePractice50AddingConstructorToClass {

    public static void main(String[] args){
        constructorLessonAircraft cessna172 = new constructorLessonAircraft(4, 140, 56.5, 9.5); //instantiating objects
        constructorLessonAircraft piperSaratoga = new constructorLessonAircraft(6, 201, 102.5, 20.5);

//        cessna172.passengers = 4; //since creating constructor, don't need these anymore
//        cessna172.cruiseSpeed = 140;
//        cessna172.fuelCapacity = 56.5;
//        cessna172.fuelBurnRate = 9.5;

//        piperSaratoga.passengers = 6;
//        piperSaratoga.cruiseSpeed = 201;
//        piperSaratoga.fuelCapacity = 102.5; // gallons
//        piperSaratoga.fuelBurnRate = 20.5;

        //
        System.out.println("For Cessna172 to fly for 4.2 hours, it takes " + cessna172.fuelNeeded(4.2) + " gallons of fuel");
        System.out.println("For Saratoga to fly for 1.25 hours " + piperSaratoga.fuelNeeded(1.25) + " gallons of fuel");
    }
}

class constructorLessonAircraft {  //CLASS IS A TEMPLATE
    int passengers; //members variables of constructorLessonAircraft class
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;


    //constructor: (has to be same name as class)

    constructorLessonAircraft(int p, int c, double fc, double fbr){ //these are named after member variables above
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
}
