import org.w3c.dom.ls.LSOutput;

public class YoutubePractice43DefiningAClassAndCreatingObjects {

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
        groceryStore houstonStore = new groceryStore();
        //making a copy and instantiating into this name (houstonStore)

        groceryStore seattleStore = new groceryStore();

        groceryStore orlandoStore = new groceryStore();

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

        //gross revenue income for each store:

//        double houstonGrossRevenue;
//        houstonGrossRevenue = (houstonStore.applesSold * houstonStore.appleRetail) + (houstonStore.orangesSold * houstonStore.orangesRetail);
//        System.out.println("Houston store's gross income revenue is: " + houstonGrossRevenue);
//
//        double seattleGrossRevenue;
//        seattleGrossRevenue = (seattleStore.applesSold * seattleStore.appleRetail) + (seattleStore.orangesSold * seattleStore.orangesRetail);
//        System.out.println("Seattle store's gross income revenue is: " + seattleGrossRevenue);
//
//        double orlandoGrossRevenue;
//        orlandoGrossRevenue = (orlandoStore.applesSold * orlandoStore.appleRetail) + (orlandoStore.orangesSold * orlandoStore.orangesRetail);
//        System.out.println("Orlando store's gross income revenue is: " + orlandoGrossRevenue);

        //lesson 46 exercise content:
        System.out.println("\n\tHouston Store Revenue:");
        houstonStore.grossRevenue();

        System.out.println("\n\tSeattle Store Revenue:");
        seattleStore.grossRevenue();

        System.out.println("\n\tOrlando Store Revenue");
        orlandoStore.grossRevenue();
    }
}

//class aircraft {
//    int passengers;             // number of people
//    int cruiseSpeed;            // miles per hour
//    double fuelCapacity;        // gallons quantity
//    double fuelBurnRate;        // gallons per hour
//    //when you associate these with object(s), then memory is allocated/assigned
//}

/*
1.
 You are a business owner who owns several grocery stores.
 All of your stores sell apples and oranges.

 Create a class called groceryStore. In this class, create 4 member variables
 for the following information. Use your own creative variable names.

 Number of apples sold per year
 Retail price of each apple
 Number of oranges sold per year
 Retail price of each orange

 Create 3 objects of the groceryStore class called:
 houstonStore
 seattleStore
 orlandoStore
 */

class groceryStore {
    int applesSold;
    double appleRetail;
    int orangesSold;
    double orangesRetail;


    //method aplicable to all stores below:
    void grossRevenue(){

    double storeGrossRevenue = (applesSold * appleRetail) + (orangesSold * orangesRetail);
        System.out.println("Store revenue is: " + storeGrossRevenue);
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

/*
Lesson 45 exercise - relative to this lesson:
Calculate the gross revenue of the Houston store, Seattle store, and Orlando store, separately
 */

/*
Lesson 46 exercise - relative to this lesson/class:
Create a method named grossRevenue and add it to the groceryStore class that calculates
the gross revenue of the store, then print the results to the screen.
Back in the main method, call the grossRevenue method for each of the three stores:
(Houston, Seattle, Orlando).
In the end, we'd like to see the gross revenue of each store printed on the screen.
 */