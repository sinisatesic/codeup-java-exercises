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

    }
}

class aircraft {
    int passengers;             // number of people
    int cruiseSpeed;            // miles per hour
    double fuelCapacity;        // gallons quantity
    double fuelBurnRate;        // gallons per hour
    //when you associate these with object(s), then memory is allocated/assigned
}

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
}