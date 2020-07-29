public class YoutubePractice9ForLoops {

    //for(initialization; condition; iteration) execute statement;

    public static void main(String[] args){

        int counter;

        for (counter = 0; counter <= 10; counter++)
            System.out.println("\tThe counter is at " + counter);

        int secondCounter;

        for (secondCounter = 5; secondCounter <= 20; secondCounter+=5)
            System.out.println("\n\tThe second counter is at " + secondCounter);


        for(secondCounter = 100; secondCounter >= 50; secondCounter-=10)
            System.out.println("second counter now is at " + secondCounter);


        //1.
        /*
        Write a program that uses a for loop to output the following countdown.
        Notice that there is a blank line between every number
        10

        9

        8

        7 (and keeps going like this to zero)
         */

        for(int i = 10; i >= 0; i-=1)
            System.out.println(i + "\n");


        //2.
        /*
        Write a program to "count by 2's" from 0 to 16 as shown below. Format
        the output as follows:

        The current number is: 0
        The current number is: 2
        The current number is: 4 (and so on until 16)
         */

        for(int i = 0; i <= 16; i+=2)
            System.out.println("The current number is: " + i);
    }
}
