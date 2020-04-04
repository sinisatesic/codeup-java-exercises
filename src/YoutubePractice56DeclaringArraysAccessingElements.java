public class YoutubePractice56DeclaringArraysAccessingElements {

    public static void main(String[] args) {
        int ages[] = new int[5]; //in Java, arrays are implemented as objects; here we're declaring a new array
        //this above declaration assigns 5 element values into the newly declared array

        System.out.println("The first element is " + ages[0]); //Java always puts in value of zero when initializing arrays

        ages[0] = 4; //first element has int value (age) of 4 now
        ages[1] = 5;
        ages[2] = 6;
        ages[3] = 7;
        ages[4] = 8;

        System.out.println(ages[0]); //now instead of zero value, value of 4, due to first element being assigned this value, will print

        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);


        //if you try to call a new element in from declared array, you will get error: out of bounds!

        //double value array:

        double heights[] = new double[5]; //this array will hold double value types

        //storing values:
        heights[0] = 4.7;
        heights[1] = 3.7;
        heights[2] = 6.5;
        heights[3] = 2.9;
        heights[4] = 4.0;

        System.out.println("The first child's height is: " + heights[0]);
        System.out.println("The second child's height is: " + heights[1]);

        //putting values into array at time of declaration:
        int numbers[] = {1, 2, 3, 4, 5};

        System.out.println("Numbers example: " + numbers[0]);
        System.out.println("Numbers example: " + numbers[1]);
        System.out.println("Numbers example: " + numbers[2]);
        System.out.println("Numbers example: " + numbers[3]);
        System.out.println("Numbers example: " + numbers[4]);



    }
}
