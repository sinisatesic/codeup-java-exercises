public class YoutubePractice48ClassMethodsWithParameters {

    public static void main(String[] args){
        anotherAircraft cessna172 = new anotherAircraft();
        anotherAircraft piperSaratoga = new anotherAircraft();

        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 9.5;

        piperSaratoga.passengers = 6;
        piperSaratoga.cruiseSpeed = 201;
        piperSaratoga.fuelCapacity = 102.5; // gallons
        piperSaratoga.fuelBurnRate = 20.5;

        //
        System.out.println("For Cessna172 to fly for 4.2 hours, it takes " + cessna172.fuelNeeded(4.2) + " gallons of fuel");
        System.out.println("For Saratoga to fly for 1.25 hours " + piperSaratoga.fuelNeeded(1.25) + " gallons of fuel");
    }
}

class anotherAircraft {  //TEMPLATE TEMPLATE TEMPLATE
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;

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