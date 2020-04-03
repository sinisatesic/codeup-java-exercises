public class YoutubePractice53This {

    public static void main(String[] args){
        thisLessonConstructor cessna172 = new thisLessonConstructor(4, 140, 56.5, 9.5); //instantiating objects
        thisLessonConstructor piperSaratoga = new thisLessonConstructor(6, 201, 102.5, 20.5);


        //
        System.out.println("For Cessna172 to fly for 4.2 hours, it takes " + cessna172.fuelNeeded(4.2) + " gallons of fuel");
        System.out.println("For Saratoga to fly for 1.25 hours " + piperSaratoga.fuelNeeded(1.25) + " gallons of fuel");
    }
}

class thisLessonConstructor {  //CLASS IS A TEMPLATE
    int passengers; //members variables of constructorLessonAircraft class
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;


    //constructor: (has to be same name as class)

    thisLessonConstructor(int p, int c, double fc, double fbr){ //these are named after member variables above
        this.passengers = p;
        this.cruiseSpeed = c;
        this.fuelCapacity = fc;
        this.fuelBurnRate = fbr;
    }


    //method to calculate aircraft endurance

    double calculateEndurance() {   //type of method type has to match value type
        //not returning anything and not taking parameters
        double endurance;

        endurance = this.fuelCapacity / this.fuelBurnRate;
        //this keyword just shows which member variables the code is affiliated with

//        System.out.println("The endurance is " + endurance + " hours.");
        return endurance; //returning answer to where it was called from
    }


    //new method, but still in anotherAircraft class
    double fuelNeeded(double time){
        return this.fuelBurnRate * time;
    }
}
