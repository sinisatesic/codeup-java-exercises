public class YoutubePractice51ConstructorsExcercise {

    /*
    1.
    We will continue working with the groceryStore class that we created in a previous exercise.

    Copy/paste the code from the previous exercise to define the groceryStore Class.
    Alter the groceryStore class to add a constructor that will take information on apples and oranges and assign these numbers
    to the instance variables.

    Then, call the method grossRevenue and use it to print out the revenue for each store.

    Next, call the method appleRevenueTarget with a value of $1000 for each of the three stores.

    Finally, call the method orangeRevenueTarget with a value of $800 for each of the three stores.
     */



    public static void main(String[] args){
        //class = template
        //object = specific instance of the class



        groceryConstructorLesson houstonStore = new groceryConstructorLesson(534, 0.99, 429, 0.87);
        //making a copy and * instantiating * into this name (houstonStore)

        groceryConstructorLesson seattleStore = new groceryConstructorLesson(765, 0.86, 842, 0.91);

        groceryConstructorLesson orlandoStore = new groceryConstructorLesson(402, 0.77, 398, 0.79);

        //

        //after constructor in place, we don't need below
//        houstonStore.applesSold = 534;
//        houstonStore.appleRetail = 0.99;
//        houstonStore.orangesSold = 429;
//        houstonStore.orangesRetail = 0.87;
//
//        //
//
//        seattleStore.applesSold = 765;
//        seattleStore.appleRetail = 0.86;
//        seattleStore.orangesSold = 842;
//        seattleStore.orangesRetail = 0.91;
//
//        //
//
//        orlandoStore.applesSold = 402;
//        orlandoStore.appleRetail = .77;
//        orlandoStore.orangesSold = 398;
//        orlandoStore.orangesRetail = .79;
//
//        //example printing object variables:
//        System.out.println("\nHouston Store:\n");
//        System.out.println("Apples sold: " + houstonStore.applesSold);
//        System.out.println("Apple retail price: " + houstonStore.appleRetail);
//        System.out.println("Oranges sold: " + houstonStore.orangesSold);
//        System.out.println("Orange retail price: " + houstonStore.orangesRetail);

        //lesson 45 exercise
        //gross revenue income for all stores combined:
//        double grossIncomeRevenue;
//        grossIncomeRevenue = (houstonStore.applesSold * houstonStore.appleRetail + houstonStore.orangesSold * houstonStore.orangesRetail) + (seattleStore.applesSold * seattleStore.appleRetail + seattleStore.orangesSold * seattleStore.orangesRetail) + (orlandoStore.applesSold * orlandoStore.appleRetail + orlandoStore.orangesSold * orlandoStore.orangesRetail);
//        System.out.println("Gross income revenue for all stores is: " + grossIncomeRevenue);
//
//        System.out.println("Houston store revenue is " + houstonStore.grossRevenue());
//
//
//        double houstonRevenue = houstonStore.grossRevenue(); //more concise way of doing it
//        System.out.println("Houston store revenue is " + houstonRevenue);
//
//
//        System.out.println("Seattle store revenue is " + seattleStore.grossRevenue());
//
//        double seattleRevenue = seattleStore.grossRevenue();
//        System.out.println("Seattle store revenue be: " + seattleRevenue);
//
//
//        System.out.println("Orlando store revenue is " + orlandoStore.grossRevenue());
//
//        double orlandoRevenue = orlandoStore.grossRevenue();
//        System.out.println("Da Orlandoz revenue iz: " + orlandoRevenue);
//
//        //How many apples are needed to earn $1050 for the Houston store.
//
//        System.out.println("For Houston store to earn $1050 from apples, we need to sell " + houstonStore.applesRevenueTarget(1050) + " apples");
//
//        //How many oranges are needed to earn $620 for the Seattle store.
//        System.out.println("For Seattle store to earn $620 from oranges, we need to sell " + seattleStore.orangeRevenueTarget(620) + " oranges");
//
//        //How many apples are needed to earn $744 for the Orlando store.
//        System.out.println("For Orlando store to earn $744 from apples, we need to sell " + orlandoStore.applesRevenueTarget(744) + " apples");


    //Lesson 51: calling each object's grossRevenue method:
        // Then, call the method grossRevenue and use it to print out the revenue for each store.
        System.out.println(houstonStore.grossRevenue() + "\n");
        System.out.println(seattleStore.grossRevenue() + "\n");
        System.out.println(orlandoStore.grossRevenue() + "\n");

        //or even better:

        System.out.println("Houston Revenue: " + houstonStore.grossRevenue() + " Seattle Revenue: " + seattleStore.grossRevenue() + " Orlando Revenue: " + orlandoStore.grossRevenue() + "\n");

        // Next, call the method appleRevenueTarget with a value of $1000 for each of the three stores.

        System.out.println("To attain $1000 in revenue, Houston has to sell " + houstonStore.applesRevenueTarget(1000) + " apples");
        System.out.println("For same target, Seattle has to sell " + seattleStore.applesRevenueTarget(1000) + " apples");
        System.out.println("For same target, Orlando has to sell " + orlandoStore.applesRevenueTarget(1000) + " apples\n");

        // Finally, call the method orangeRevenueTarget with a value of $800 for each of the three stores.

        System.out.println("To attain $800 in revenue, Houston has to sell " + houstonStore.orangeRevenueTarget(800) + " oranges");
        System.out.println("For same target, Seattle has to sell " + seattleStore.orangeRevenueTarget(800) + " oranges");
        System.out.println(" For same target, Orlando has to sell " + orlandoStore.orangeRevenueTarget(800) + " oranges\n");

        // For total revenue between stores (now with proper constructor in place):
        System.out.println("Total revenue for all: " + (houstonStore.grossRevenue() + seattleStore.grossRevenue() + orlandoStore.grossRevenue()));

    }
}

//outside of main

class groceryConstructorLesson {
    int applesSold;
    double appleRetail;
    int orangesSold;
    double orangesRetail;

    //lesson 51 exercise (constructor):

    groceryConstructorLesson(int as, double ar, int os, double or){
        applesSold = as;
        appleRetail = ar;
        orangesSold = os;
        orangesRetail = or;

    }


    //method aplicable to all stores below:
    double grossRevenue(){      //noticed how it becomes lit-up when called in main

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
