public class YoutubePractice62UsingArrayLengthInstanceVariables {

    public static void main(String[] args){
        int pancakes[] = {4,5,3,4,5,4,5,6,7,8,9,0,8,7,56,4,4,3,5};

        System.out.println(pancakes[0]);
        //above will print 4

        System.out.println(pancakes.length);
        //.length is instance variable; also sometimes called member variable
        //length of above array is 19, which is what will print

        for(int i = 0; i <= 18; i++){
            System.out.println(pancakes[i]);
        }
        //above loop can be used if you know how many elements you have in array


        for (int i = 0; i <= pancakes.length - 1; i++){
            System.out.println(pancakes[i]);
        }
        //this loop can be used when you don't know number of elements in array
        //NOTE: there is a -1 asserted to pancakes.length because of index 0; otherwise
        // loop will count 1 over, and an out of bounds error will occur


        /*
        Exercise:
        1.
        Create an one dimensional array with the following floating point data:
        332.1
        55.4
        76.4
        88.5
        45.3
        88.8
        76.7

        Use a for loop that utilizes the length instance variable for this array
        to print the contents of this array. Next, add a few additional values to the array and verify
        that the print loop continues to function properly.
         */

        double arrayz[] = {332.1,55.4,76.4,88.5,45.3,88.8,76.7,35,76.1,22.2};

        for(int i = 0; i <= arrayz.length-1; i++){
            System.out.println(arrayz[i]);
        }

    }
}
