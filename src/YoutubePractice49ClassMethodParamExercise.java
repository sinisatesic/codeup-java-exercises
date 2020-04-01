public class YoutubePractice49ClassMethodParamExercise {

    public static void main(String[] args){
        //class = template
        //object = specific instance of the class

        int var1 = 5;
        double var2 = 3.65;
        //the above is similar when creating object

        //we have to tell Java what TYPE (notice name same as class, because this object is instance of said class)  of object we're creating
        aircraft cessna172 = new aircraft();   //creates object of class aircraft
        //aircraft = class, cessna172 = name, new aircraft() = new object, and cessna172 is its placeholder
        //since this object has characteristics of class aircraft, it has associated with it the variables in the aircraft class (passengers, cruiseSpeed, etc)

        aircraft piperSaratoga = new aircraft(); // another new object of class aircraft

        //exercise:
        groceryStoreTwo houstonStore = new groceryStoreTwo();
        //making a copy and * instantiating * into this name (houstonStore)

        groceryStoreTwo seattleStore = new groceryStoreTwo();

        groceryStoreTwo orlandoStore = new groceryStoreTwo();

        //

        houstonStore.applesSold = 534;
        houstonStore.appleRetail = 0.99;
        houstonStore.orangesSold = 429;
        houstonStore.orangesRetail = 0.87;

        //

        seattleStore.applesSold = 765;
        seattleStore.appleRetail = 0.86;
        seattleStore.orangesSold = 842;
        seattleStore.orangesRetail = 0.91;

        //

        orlandoStore.applesSold = 402;
        orlandoStore.appleRetail = .77;
        orlandoStore.orangesSold = 398;
        orlandoStore.orangesRetail = .79;

        //example printing object variables:
        System.out.println("\nHouston Store:\n");
        System.out.println("Apples sold: " + houstonStore.applesSold);
        System.out.println("Apple retail price: " + houstonStore.appleRetail);
        System.out.println("Oranges sold: " + houstonStore.orangesSold);
        System.out.println("Orange retail price: " + houstonStore.orangesRetail);

        //lesson 45 exercise
        //gross revenue income for all stores combined:
        double grossIncomeRevenue;
        grossIncomeRevenue = (houstonStore.applesSold * houstonStore.appleRetail + houstonStore.orangesSold * houstonStore.orangesRetail) + (seattleStore.applesSold * seattleStore.appleRetail + seattleStore.orangesSold * seattleStore.orangesRetail) + (orlandoStore.applesSold * orlandoStore.appleRetail + orlandoStore.orangesSold * orlandoStore.orangesRetail);
        System.out.println("Gross income revenue for all stores is: " + grossIncomeRevenue);

        System.out.println("Houston store revenue is " + houstonStore.grossRevenue());


        double houstonRevenue = houstonStore.grossRevenue(); //more concise way of doing it
        System.out.println("Houston store revenue is " + houstonRevenue);


        System.out.println("Seattle store revenue is " + seattleStore.grossRevenue());

        double seattleRevenue = seattleStore.grossRevenue();
        System.out.println("Seattle store revenue be: " + seattleRevenue);


        System.out.println("Orlando store revenue is " + orlandoStore.grossRevenue());

        double orlandoRevenue = orlandoStore.grossRevenue();
        System.out.println("Da Orlandoz revenue iz: " + orlandoRevenue);

        //How many apples are needed to earn $1050 for the Houston store.

        System.out.println("For Houston store to earn $1050 from apples, we need to sell " + houstonStore.applesRevenueTarget(1050) + " apples");

        //How many oranges are needed to earn $620 for the Seattle store.
        System.out.println("For Seattle store to earn $620 from oranges, we need to sell " + seattleStore.orangeRevenueTarget(620) + " oranges");

        //How many apples are needed to earn $744 for the Orlando store.
        System.out.println("For Orlando store to earn $744 from apples, we need to sell " + orlandoStore.applesRevenueTarget(744) + " apples");
    }
}

//outside of main

class groceryStoreTwo {
    int applesSold;
    double appleRetail;
    int orangesSold;
    double orangesRetail;


    //method aplicable to all stores below:
    double grossRevenue(){

        double storeGrossRevenue = (applesSold * appleRetail) + (orangesSold * orangesRetail);
        return storeGrossRevenue;
    }

    //for lesson 49 exercise:
    double applesRevenueTarget(double targetRevenue){
        return targetRevenue / appleRetail;
    }

    double orangeRevenueTarget(double targetRevenue){
        return targetRevenue / orangesRetail;
    }
}
/*
1. after instantiating objects in main:
Add two new methods to the groceryStoreTwo class as follows:

appleRevenueTarget
This method takes as an argument the target revenue we'd like to make just by selling apples. The method
calculates how many apples we need to sell to meet our target, and
returns this answer to the caller.

orangeRevenueTarget
This method takes as an argument the target revenue we'd like to make just by selling oranges.
The method calculates how many oranges we need to sell to meet our target, and
returns this answer to the caller.

In the main method, use these methods to print the following info on the screen:

How many apples are needed to earn $1050 for the Houston store.
How many oranges are needed to earn $620 for the Seattle store.
How many apples are needed to earn $744 for the Orlando store.

 */