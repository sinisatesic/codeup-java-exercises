import java.util.Scanner;

public class Bob {

    public static void main(String[] args){

            Scanner conversation = new Scanner(System.in);
            System.out.println("Converse with Bobby");
            String userInput = conversation.nextLine();

            while(true) {
                if (userInput.endsWith("?")) {
                    System.out.println("Sure?");
                    break;
                } else if (userInput.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                    break;
                } else if (userInput.isEmpty()) {
                    System.out.println("Fine, be that way!");
                    break;
                } else {
                    System.out.println("Whatever");
                    break;
                }
            }
    }
}
