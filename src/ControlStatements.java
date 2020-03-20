import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = sc.next();

        boolean confirmation = userInput.equalsIgnoreCase("y");
        //the .equalsIgnoreCase ignores whether input is upper case or not

        System.out.println(confirmation);

    }
}
