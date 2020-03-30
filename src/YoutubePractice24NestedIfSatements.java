import java.util.Scanner;

public class YoutubePractice24NestedIfSatements {

    public static void main(String[] args){
        int temperature = 89;
        boolean sunny = false;

        if (temperature > 90){
            System.out.println("It's hot");
            if (sunny == true) System.out.println("It's sunny");
            else System.out.println("It ain't sunny son");
        } else {
            System.out.println("It's not as hot");
            if (sunny == true) System.out.println("It's sunny");
            else System.out.println("It ain't sunny son");
        }

        /*
        1.

        Write a program that asks how many states are in the USA.
        If they guess anything other than the correct answer (50),
        then use a nested if statement to tell them if their guess was too low or too high.
         */

        Scanner userInputStates = new Scanner(System.in);
        int states;
        System.out.println("How many states in US?");
        states = userInputStates.nextInt();

        if(states == 50){
            System.out.println("Yarp");
        } else {
            System.out.println("Narp");
            if(states == 47){
                System.out.println("FOTY SEV");
            } else if (states < 50){
                System.out.println("Too low, guess higher");
            } else {
                System.out.println("Too high, guess lower");
            }
        }
    }
}
