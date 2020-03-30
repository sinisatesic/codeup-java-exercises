import java.util.Scanner;

public class YoutubePractice40MethodsIntro {

    public static void main(String[] args){
        //having everything inside of main method would be too cumbersome
        //so we can split program(s) into "chunks"
        //one of the ways that's possible is by using methods aside from main method; custom methods

        //code will execute from beginning of main method
        //we can call to other methods from main method

        //IMPORTANT: since code is executed from main method, it can be told to go into
        //other custom methods outside of main method; then, once the code in those custom
        //methods is executed, it will "jump" back to main to keep reading/executing next lines of code

//        System.out.println("My nickname a Sini");

//        printNameMethod();
        //this is CALLING the custom method outside of main method
        //it means jumping down to this above method, then once executed, jumps back to next lines on main method

        System.out.println("Program start!\n");
        printNameMethod();
        System.out.println("Program ends!");

        // below, calling second custom method outside main method

        printSomethingElse();

        //

        addingNames();

        //exercise content:

        Scanner userInputSeason = new Scanner(System.in);
        int userNum;
        System.out.println("Input a season by entering a number: (1=Spring, 2=Summer, 3=Fall, 4=Winter)");
        userNum = userInputSeason.nextInt();

        if(userNum == 1){
            printSpring();
        } else if (userNum == 2){
            printSummer();
        } else if (userNum == 3){
            printFall();
        } else if (userNum == 4){
            printWinter();
        } else {
            System.out.println("Number not an option; run again");
        }
    }

    //new methods would be outside of main method
    //encapsulated code in this method can be called to main method

    public static void printNameMethod(){
        System.out.println("My nickname is a Sini");
        System.out.println("wassuip");

        //void means doesn't return anything; printing is just showing, not returning

        //if you're RETURNING BACK a num/equation/double, etc, then you need to tell method
        //you will be returning that type back; so, you'd replace void with type you're returning
    }

    public static void printSomethingElse(){
        System.out.println("You like pancakes?");
    }

    public static void addingNames() {
        int sini = 4;
        int tesic = 5;
        int sum;

        //NOTE: this is not returning, just printing arithmetic done in this custom method
        //these variables above are only contained/recognized in this method (scope)
        sum = sini + tesic;
        System.out.println("Number of letters in input names: " + sum);
    }


    //below for exercise:

    public static void printSpring(){
        System.out.println("The season is Spring, and the flowers are blooming!");
    }

    public static void printSummer(){
        System.out.println("The season is Summer, and it is getting hot!");
    }

    public static void printFall(){
        System.out.println("The season is Fall, and leaves are falling!");
    }

    public static void printWinter(){
        System.out.println("The season is Winter, and it is snowing!");
    }


    /*
    1.
    In the main method, ask the user to input a season by entering a number
    (1=Spring, 2=Summer, 3=Fall, 4=Winter).

    Depending on what number the user enters, call one of the four methods named and described as follows:

    printSpring
    In this method, display "The season is Spring, and flowers are blooming!"

    printSummer
    In this method, display "The season is Summer, and it is getting hot!"

    printFall
    In this method, display "The season is Fall, and leave are falling!"

    printWinter
    In this method, display "The season is Winter, and it is snowing!"
     */
}
