public class YoutubePractice60MaxAndMinValueOfArray {

    public static void main(String[] args){
        int largeArray[] = {8,-24,12,13,2,25,65,34,1,99,76,87,109,54};

        int smallest = largeArray[0];
        int largest = largeArray[0];

        for(int i = 0; i <= 13; i++){
            if (largeArray[i] < smallest){
                smallest = largeArray[i];
            } else if (largeArray[i] > largest) {
                largest = largeArray[i];
            }

        }
            System.out.println("The smallest value in the Array is: " + smallest);
            System.out.println("The largest value in the Array is: " + largest);
            //prints statements need to be OUTSIDE of for loop; otherwise, it will loop several iterations over and over
    }
}
