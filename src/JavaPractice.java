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
                System.out.println(quinton);
            } else {
                System.out.println(notAClass);
            }
        } while (decidingOnClass);

    }



    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        int input;
        while(true) {
            input = scan.nextInt();
            if (input >= min && input <= max) return input;
            System.out.println("Number out of range; try again");
            System.out.printf("Enter number between %d and %d.\n", min, max);
            //%n only works on printf, while \n works everywhere
        }



    }

}
