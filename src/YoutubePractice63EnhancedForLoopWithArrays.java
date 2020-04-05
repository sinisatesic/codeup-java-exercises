public class YoutubePractice63EnhancedForLoopWithArrays {

    public static void main(String[] args){
        int sini[] = {3,4,5,6,7,8,9,10,11};

        for(int element : sini){
            //with this enhanced for loop, iterations get stored in "element"
           //prints out each variation of array above
//            System.out.println(element);
            System.out.println(element * element); //can use in calculations too
        }

        /*
        Exercise:
        1.
        Create an 8 element array with the following data:
        12, 43, 54, 2, 7, 33, 65, 4

        Use an enhanced for loop to search through this array and print out
        the maximum and minimum elements of the array
         */

        int exercise[] = {12,43,54,2,7,33,65,4,-2,177};
        int max = exercise[0];
        int min = exercise[0];
        for(int iteration : exercise){
            if (iteration > max ){
                max = iteration;
            } else if (iteration < min){
                min = iteration;
            }
        }
        System.out.println("Largest number of array is: " + max);
        System.out.println("Smallest number of array is: " + min);
    }
}
