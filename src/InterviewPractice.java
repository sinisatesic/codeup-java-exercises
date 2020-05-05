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
    }

    //checking for palindrome
    public static void checkPal (String s){

        //reverse the given String
        String reverse = new StringBuffer(s).reverse().toString();

        //check whether the string is palindrome
        if (s.equals(reverse))
            System.out.println("yarp");

        else
            System.out.println("narp");
    }


    public static boolean isPalindrome(String str){

        //pointers pointing to the beginning and end of string
        int i = 0, j = str.length() - 1;

        //while there are characters toc compare
        while (i < j) {
            //if there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            //increment first point and decrement other
            i++;
            j--;
        }

        //give string is a palindrome
        return true;
    }
}
