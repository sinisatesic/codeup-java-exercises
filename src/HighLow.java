import java.util.Random;
import java.util.Scanner;

public class HighLow {
    //! THIS IS HOW U DECLARE A SCANNER GLOBALLY
//    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(playGame());
    }
    //! GET RANDOM
    public static int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(100);
    }
    //! Guess Number && Validate
    public static int promtNumber(){
        int guess;
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess which number I'm thinking of?");
        while(true){
            guess = scan.nextInt();
            if(guess > 0 && guess <= 100) break;
            System.out.println("Please enter a number between 0-101");
        }
        return guess;
    }

    public static String response(int num, int randomNumber){
        if(num < randomNumber) return "Higher";
        if(num > randomNumber) return "Lower";
        else return "GOOD GUESS";
    }
    public static int generatedNumber = getRandomNumber();

    public static String playGame(int number, int random){
        if(number == 5 ) {
            System.err.printf("-- %d --", random);
            return "GAME OVER";
        }
        String answer = "";
//        System.out.println("random: " + random);
        int guess = promtNumber();
        if(guess == random) return response(guess, random);
        else {
            System.out.println(response(guess, random));
            return playGame(number +1, random) + "";
        }
    }

    public static String playGame(){
        return playGame(0, generatedNumber);
    }

}