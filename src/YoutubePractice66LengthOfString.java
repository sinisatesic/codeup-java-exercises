public class YoutubePractice66LengthOfString {

    public static void main(String[] args) {
        String car1 = "Ford";
        String car2 = "Chevy";
        String car3 = "Mitsubishi";
        String str = "Cars are tight";

        System.out.println(car1);

        System.out.println(car1.length());
//        if (car1.length() > 4){
//            System.out.println("testing");
//        } else if (car1.length() <= 4){
//            System.out.println("poop");
//        }
        //car1 is an object of type string; .length method will return integer of length

        System.out.println();
        System.out.println(car2);
        System.out.println(car2.length());

        System.out.println();
        System.out.println(car3);
        System.out.println(car3.length());

        System.out.println();
        System.out.println(str);
        System.out.println(str.length());

        /*
        Exercise:
        1.
        Create four strings.
        The first should contain the text "The itsy bitsy spider"
        The second should contain " climbed up the water spout."
        The third should contain " Down came the rain, "
        The fourth should contain " and washed the spider out."

        Use the length() method and the println() method to print out
        the length of each of the four strings above.
         */

        String spiderOne = "The itsy bitsy spider";
        String spiderTwo = " climbed up the water spout.";
        String spiderThree = "Down came the rain";
        String spiderFour = " and washed the spider out.";

        System.out.println();
        System.out.println(spiderOne.length());
        System.out.println(spiderTwo.length());
        System.out.println(spiderThree.length());
        System.out.println(spiderFour.length());
    }
}
