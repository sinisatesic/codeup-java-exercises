import java.util.Scanner;

public class JavaPractice {

    public static void main(String[] args){

        int min = 1;
        int max = 10;
        System.out.printf("Enter number between %d and %d.\n", min, max);
        int response = getInteger(min,max);
        System.out.printf("The user's response was %d", response);

        //below is a part of the adventure game
        System.out.println("Choose your class by typing their name: \n Chad \n Niel \n Quinton \n Type ready after entering your class name");
        Scanner choosingClass = new Scanner(System.in);
        String classComplete = "ready";
        String chad = "You have chosen the class of Chad, the Jock";
        String niel = "You have chosen the class of Niel, the Nerd";
        String quinton = "You have chosen the class of Quinton, the Introvert";
        String notAClass = "There is no such class!";
        boolean decidingOnClass = true;
        do {
            String userSelection = choosingClass.nextLine();
            if (userSelection.toLowerCase().equalsIgnoreCase(classComplete)){
                System.out.println("Begin your adventure. Survive!");
                decidingOnClass = false;
            } else if (userSelection.equalsIgnoreCase("Chad")){
                System.out.println(chad);
            } else if (userSelection.equalsIgnoreCase("Niel")){
                System.out.println(niel);
            } else if (userSelection.equalsIgnoreCase("Quinton")){
                System.out.println(shout("sup"));
                //here i can call method shout, and it takes in String parameter, so argument here is "sup", and will come back uppercase cause of method body in shout;
                System.out.println(quinton);
            } else {
                System.out.println(notAClass);
            }
        } while (decidingOnClass);


//       sayHello("hey", "ho");
       //above is calling method sayHello that's created below and outside of main method
    }




//    public static int getInteger(int min, int max){
//        Scanner scan = new Scanner(System.in);
//        int input;
//        while(true) {
//            input = scan.nextInt();
//            if (input >= min && input <= max) return input;
//            System.out.println("Number out of range; try again");
//            System.out.printf("Enter number between %d and %d.\n", min, max);
//            //%n only works on printf, while \n works everywhere
//        }
//
//
//
//    }

    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        int input;
        while(true) {
            input = scan.nextInt();
            if (input >= min && input <= max) return input;
            System.out.println("Out of range, go again");
            System.out.printf("Enter number between %d and %d.\n", min, max);
        }
    }


    public static String sayHello(String name){
        return String.format("wassup", name);
    }
    //public -- this is the visibility modifier.
    //static -- the presence of this keyword defines that the method belongs to the class, as opposed to instances of it.
    //String -- this is the return type of the method.
    //
    //In Java, all methods must define the type of the value they will return. If a method does not return anything, the special keyword void is used here.
    //
    //If a method defines a return type, it must have a return statement. It is a compile time error for a method that defines a return type to not return anything, or to return a value of a type other than the one that is specified.
    //
    //If a method's return type is void, it is a compile time error to return anything inside of the method; however, methods with a void return type can still use the return keyword to exit the method early.
    //
    //sayHello -- the name of the method.
    //
    //Method names follow the same rules as variable names.
    //
    //(String name) -- the parameter the method accepts.
    //
    //A method can be defined with no parameters, one parameter (like in our example), or multiple parameters (separated by commas). A type must be specified for each parameter.
    //
    //Everything inside the curly braces is the body of the method.


    //more basic methods:

    public static void sayHello(String greeting, String name){
        System.out.printf("%s, %s!\n", greeting, name);
    }
    //return not necessary here because of void; void indicates there is void of declaration for type of value for method

    public static int returnThree(){
        return 3;
        //method is int type so has to return int
    }

    public static String shout(String s){
        return s.toUpperCase() + "!";
        //method is String type so has to return string
    }


}
