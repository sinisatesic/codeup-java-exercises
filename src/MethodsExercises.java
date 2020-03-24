public class MethodsExercises {

    public static void main(String[] args){

        //Basic Arithmetic
        //
        //Create four separate methods. Each will perform an arithmetic operation:
        //
        //Addition
        //Subtraction
        //Multiplication
        //Division
        //Each function needs to take two parameters/arguments so that the operation can be performed.
        //
        //Test your methods and verify the output.
        //
        //Add a modulus method that finds the modulus of two numbers.
        //
        //Food for thought: What happens if we try to divide by zero? What should happen?


        //all below is stored in main method above
        int a=3;
        int b=4;
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a/b);
        int answerAddition;
        answerAddition = addition(a, b);
        System.out.println(answerAddition);


        int answerSubtraction;
        answerSubtraction = subtraction(a, b);
        System.out.println(answerSubtraction);

        int answerMultiplication;
        answerMultiplication = multiplication(a, b);
        System.out.println(answerMultiplication);


        double answerDividing;
        answerDividing = dividing(a, b);
        System.out.println(answerDividing);
    }

    //all below are custom methods which call to variables in main method

        public static int addition(int x, int y){
            int answer = x + y;

            return answer;
        }


        public static int subtraction(int x, int y){
            int answer = x - y;

            return answer;
        }


        public static int multiplication(int x, int y){
            int answer = x * y;

            return answer;
        }


        public static double dividing(int x, int y){
            double answer = y/x;

            return answer;
        }

}
