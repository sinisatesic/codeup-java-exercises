public class YoutubePractice16VarScopeAndLifetime {

    public static void main(String[] args){
        int i = 7; //this variable is declared in scope of main method

        if(i > 5){ //this is now a new code block per the curly braces
            //any time there's additional curly braces like this, another scope has been created
            //outer set of curly braces is outer scope, inner set is inner scope
            //Java works in sense that whenever you declare a variable in outer scope/parent scope,
            //all scopes within it/children scopes will be able to see that value

            int k = 3; //inner scope declaration, so anything out of this scope calling k will produce error

        System.out.println("Value of i is " + i);//this println() method can read variable since it's within same code block
        }
//        System.out.println(k); //this will produce error because int k is within the inner scope here

        int count = 0;

        for(count = 0; count <= 8; count++){
            int test = 5;
            System.out.println(test); //not accessible outside of its scope
            //loop creates content and then destorys, and then keeps repeting process
            test = 7;
            System.out.println(test); //it will start with test being 5, and end with it being 7 due to reassigning.
            //loop will create, and then destroy upon next iteration, so it re-initialize, and always start with 5, and end with 7
            //vars created when we go into scope, and destroyed once we leave scope
        }
    }
}
