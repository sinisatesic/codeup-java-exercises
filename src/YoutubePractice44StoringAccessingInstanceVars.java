public class YoutubePractice44StoringAccessingInstanceVars {

    public static void main(String[] args){
        //creating objects:
        aircraft cessna172 = new aircraft();
        aircraft piperSaratoga = new aircraft();



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

//        System.out.println("Piper Saratoga Cruise Speed: " + piperSaratoga.cruiseSpeed);
//
//        //for 45 lesson:
//        double cessna172Endurance; //local variable to use for calculating existing object variables
//        cessna172Endurance = cessna172.fuelCapacity / cessna172.fuelBurnRate;
//        System.out.println("A Cessna 172 can stay aloft for " + cessna172Endurance + " hours");
//        //order of code here is important; if you put all this before object variables are declared, endurance calculation will return NaN
//
//        //
//        double piperEndurance;
//        piperEndurance = piperSaratoga.fuelCapacity / piperSaratoga.fuelBurnRate;
//        System.out.println("A Piper Saratoga can stay aloft for " + piperEndurance + " hours");

        //lesson 46 content:
        //First object must be declared, then method; this is simpler to read and more efficient
        System.out.println("\n\tCessna 172");
        cessna172.calculateEndurance(); //calling object first (required), then method within aircraft class called calculateEndurance()

        System.out.println("\n\tPiper Saratoga");
        piperSaratoga.calculateEndurance(); //each object calculates with vars assigned to it in main; same variables reference those declared in aircraft class below


    }
}

        //Lesson 46 content: method in classes
class aircraft {  //TEMPLATE TEMPLATE TEMPLATE
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;

    //method to calculate aircraft endurance

   void calculateEndurance() {
       //not returning anything and not taking parameters
       double endurance;

       endurance = fuelCapacity / fuelBurnRate;

       System.out.println("The endurance is " + endurance + " hours.");
   }
}

/*
1.

Add additional code to the last exercise dealing with the groceryStore class. Store
values into the instance variables as follows:

For the Houston Store:
number of applies sold per year = 534
retail price of each apple = .99
number of oranges sold per year = 429
retail price of each orange = .87

For the Seattle store:
number of apples sold per year = 765
retail price of each apple = .86
number of oranges sold per year = 842
retail price of each orange = .91

For the Orlando Store:
number of apples sold per year = 402
retail price of each apple = .77
number of oranges sold per year = 398
retail price of each orange = .79
 */