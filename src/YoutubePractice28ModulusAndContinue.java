public class YoutubePractice28ModulusAndContinue {

    public static void main(String[] args){
        System.out.println(4%2);

        int i;
        for(i = 1; i <= 30; i++){
            if(i % 5 == 0){
                System.out.println(i + "multiple of 5");
                continue; //important that continue is after above println()
            }
            System.out.println(i);
        }

        /*
        1.

        Write a program that uses a for loop with continue statement
        to print out all even numbers between 1 and 100.
         */
        int j;
        for(j = 1; j <= 100; j++){
            if(j % 2 == 1){
                continue;
            }
            System.out.println(j);
        }
    }
}
