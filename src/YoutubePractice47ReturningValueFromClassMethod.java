public class YoutubePractice47ReturningValueFromClassMethod {

    public static void main(String[] args){
        //creating objects:
        newAircraft cessna172 = new newAircraft();
        newAircraft piperSaratoga = new newAircraft();

        //cessna172 object variables below:
        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 9.5; //Java knows values associated with aircraft class variables

        System.out.println("Cessna 172 passengers: " + cessna172.passengers);
        System.out.println("\nCessna 172 burn rate: " + cessna172.fuelBurnRate + " gph");

        //piper Saratoga variables object:
        piperSaratoga.passengers = 6;
        piperSaratoga.cruiseSpeed = 201;
        piperSaratoga.fuelCapacity = 102.5; // gallons
        piperSaratoga.fuelBurnRate = 20.5;  // gallons per hour

        System.out.println("Cessna 172 Endurance is: " + cessna172.calculateEndurance());
        System.out.println("Piper Saratoga Endurance is: " + piperSaratoga.calculateEndurance());

        //can also put println output into double variable:

        double enduranceSaratoga = piperSaratoga.calculateEndurance();
        System.out.println("Piper Saratoga endurance is: " + enduranceSaratoga);

    }
}

class newAircraft {  //TEMPLATE TEMPLATE TEMPLATE
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
}