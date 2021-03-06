public class InterviewPractice {

    public static void main(String[] args) {
        //first palindrome:
        checkPal("aha");

//second palindrome:
        String str = "abccba";

        if (isPalindrome(str))
            System.out.println("yes");
        else
            System.out.println("No");

        //reveres string; first char uppercase
        System.out.println(reverse("abc"));



        for(int i = 1; i <= 100; i++){
            if(i % 15 == 0) System.out.println("FizzBuzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else if(i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        };
    }


    ///////////////////////



    //checking for palindrome
    public static void checkPal(String s) {

        //reverse the given String
        String reverse = new StringBuffer(s).reverse().toString();

        //check whether the string is palindrome
        if (s.equals(reverse))
            System.out.println("yarp");

        else
            System.out.println("narp");
    }


    public static boolean isPalindrome(String str) {

        //pointers pointing to the beginning and end of string
        int i = 0, j = str.length() - 1;

        //while there are characters to compare
        while (i < j) {
            //if there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            //increment first point and decrement other
            i++;
            j--;
        }

        //if given string is a palindrome
        return true;
    }


    //reverse a string and capitalize first letter
    public static String reverse(String str) {
        String result = "";
        String[] items = str.split(" ");

        for (int i = 0; i < items.length; i++) {
            result += new StringBuffer(items[i]).reverse().toString();
        }
        return result.substring(0, 1).toUpperCase() + result.substring(1);
    }
}
