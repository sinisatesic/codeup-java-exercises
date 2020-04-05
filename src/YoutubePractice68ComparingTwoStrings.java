public class YoutubePractice68ComparingTwoStrings {

    public static void main(String[] args) {
        String str1 = "apples are my favorite fruit";
        String str2 = "apricots are delicious";
        String str3 = "insects are gross";

        System.out.println(str1);
        System.out.println(str2);

        //strings comparison below is based on alphabetical order of letters, not length of strings
        if(str1.compareTo(str2) > 0){
            System.out.println("Str1 comes after Str2");
        } else if (str1.compareTo(str2) < 0){
            System.out.println("Str1 comes before Str2");
        } else if (str1.compareTo(str2) == 0){
            System.out.println("Str1 is equal to Str2");
        }

        System.out.println();
        if (str3.compareTo(str2) > 0){
            System.out.println("Str3 comes after Str2");
        } else if (str3.compareTo(str2) < 0){
            System.out.println("Str3 comes before Str2");
        } else if (str3.compareTo(str2) == 0){
            System.out.println("Str3 is equal to Str2");
        }

        /*
        Exercise
        1.
        Create four strings, exactly as shown below.

        The first should contain the text "apple pie"
        The second should contain "zebras"
        The third should contain "bubble gum"
        The fourth should contain "Fish Sticks"

        Print all four strings to the screen, then:
        Compare string 1 with string 2 and print to the screen if string 1 is less or greater.
        Compare string 1 with string 3 and print to the screen if string 1 is less or greater.
        Compare string 3 with String 1 and print to the screen if string 3 is less or greater.
        Compare string 4 with string 1 and print to the screen if string 4 is less or greater.
         */

        String strOne = "apple pie";
        String strTwo = "zebras";
        String strThree = "bubble gum";
        String strFour = "Fish Sticks";

        System.out.println();
        if(strOne.compareTo(strTwo) < 0){
            System.out.println("StrOne is less than StrTwo");
        } else if (strOne.compareTo(strTwo) > 0){
            System.out.println("StrOne is greater than StrTwo");
        } else if (strOne.compareTo(strTwo) == 0){
            System.out.println("StrOne and strTwo are equal");
        }

        if(strOne.compareTo(strThree) < 0){
            System.out.println("StrOne is less than StrThree");
        } else if (strOne.compareTo(strThree) > 0){
            System.out.println("StrOne is greater than StrThree");
        } else if (strOne.compareTo(strThree) == 0){
            System.out.println("StrOne and StrThree are equal");
        }

        if(strThree.compareTo(strOne) < 0){
            System.out.println("StrThree is less than StrOne");
        } else if (strThree.compareTo(strOne) > 0){
            System.out.println("StrThree is greater than StrOne");
        } else if (strThree.compareTo(strOne) == 0){
            System.out.println("StrThree is equal to StrOne");
        }

        //this one prints as it does because of capital letters! Uppercase come before lowercase
        if(strFour.compareTo(strOne) < 0){
            System.out.println("StrFour is less than StrOne");
        } else if (strFour.compareTo(strOne) > 0){
            System.out.println("StrFour is greater than StrOne");
        } else if (strFour.compareTo(strOne) == 0){
            System.out.println("StrFour and StrOne are equal");
        }
    }
}
