public class YoutubePractice29WhileLoop {

    public static void main(String[] args){

        int i = 1; //if initial quantity doesn't fit in condition in loop, it won't run

        while(i <= 10){
            System.out.println(i);
            i++;
        }


        char letter = 'A'; //remember ,chars are actually number based (ASCII)

        while(letter <= 'Z'){
            System.out.println("Current letter: " + letter);
            letter++;
        }

        /*
        1.

        Write a program that uses a while loop to calculate the sum of all numbers
        from 1 to 100, then output the result to the screen.
         */
        int z = 1;
        int sum = 0; //RUNNING TOTAL OF SUM NEEDED

        while(z <= 100){
            sum+=z; //ADD CURRENT NUMBER TO RUNNING TOTAL IN "SUM"
            z++;
        }
        System.out.println("Total sum of iterated numbers: " + sum);

    }
}
