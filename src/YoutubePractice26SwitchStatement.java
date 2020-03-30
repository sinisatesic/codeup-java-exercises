import java.util.Scanner;

public class YoutubePractice26SwitchStatement {

    public static void main(String[] args){
//        char grade = 'A';
//
//        switch(grade){
//            case 'A':
//                System.out.println("Da A");
//                break; //"breaks" out of switch statement and executes next code after the statement
//            case 'B':
//                System.out.println("Da B");
//                break;
//            case 'C':
//                System.out.println("Da C");
//                break;
//            case 'D':
//                System.out.println("Da D");
//                break;
//            case 'F':
//                System.out.println("Da F");
//                break;
//            default: //catches anything other than cases
//                System.out.println("Something else other than cases");
//        }

        /*
        1.

        Write a program that asks a user to enter their favorite Month.
        Use 1 = January, 2 = February, etc.
        Use a switch statement to output the following:

        Output the following based on what was chosen by the user:

        January is my favorite Month
        February is my favorite Month
        etc until December
         */

        Scanner inputMonth = new Scanner(System.in);
        int monthNumber;
        System.out.println("Enter your favorite month"); //order of this line and next is very important; if this is below next line, it will print after input from user
        monthNumber = inputMonth.nextInt();

        switch (monthNumber){
            case 1:
                System.out.println("January is ya fav");
                break;
            case 2:
                System.out.println("Feb is ya fav");
                break;
            case 3:
                System.out.println("March is ya fav");
                break;
            case 4:
                System.out.println("April is ya fav");
                break;
            case 5:
                System.out.println("May is ya fav");
                break;
            case 6:
                System.out.println("June is ya fav");
                break;
            case 7:
                System.out.println("July is ya fav");
                break;
            case 8:
                System.out.println("August is ya fav");
                break;
            case 9:
                System.out.println("September is ya fav");
                break;
            case 10:
                System.out.println("October is ya fav");
                break;
            case 11:
                System.out.println("November is ya fav");
                break;
            case 12:
                System.out.println("December is ya fav");
                break;
            default:
                System.out.println("Not a number relative to a month");


        }
    }
}
