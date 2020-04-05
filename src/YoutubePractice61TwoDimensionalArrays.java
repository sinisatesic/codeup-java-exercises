public class YoutubePractice61TwoDimensionalArrays {
/*
two dimensional arrays can greatly assist with concepts producing/needing a table of data
hypothetical output:
2   4   8   4
11  12  9   5
10  3   2   -2

rows and columns idea^

 */
    public static void main(String[] args){
        int table[][] = new int[3][4]; //two-dimensional arrays need two empty brackets for declaration
        //this above represents 3 rows, 4 columns

        //remember arrays start indexed at 0
        table[0][0] = 2; //row 0, column 0
        table[0][1] = 4; //row 0, column 1
        table[0][2] = 8; //row 0, column 2
        table[0][3] = 4; //row 0, column 3

        table[1][0] = 11; //row 1, column 0
        table[1][1] = 12; //row 1, column 1
        table[1][2] = 9; //row 1, column 2
        table[1][3] = 5; //row 1, column 3

        table[2][0] = 10; //row 2, column 0
        table[2][1] = 3; //row 2, column 1
        table[2][2] = 2; //row 2, column 2
        table[2][3] = -2; //row 2, column 3

        //this table is built in memory

        System.out.println(table[0][0] + " " + table[0][1] + " " + table[0][2] + " " + table[0][3]);
        System.out.println(table[0][0] + " " + table[1][1] + " " + table[1][2] + " " + table[1][3]);
        System.out.println(table[0][0] + " " + table[2][1] + " " + table[2][2] + " " + table[2][3]);

        //the above indices can be used anywhere else petty much, like in calculations


        /*
        Exercise:
        1.
        Create a two dimensional array with 12 "rows" and 2 "columns". The first column will
        correspond to a month of the year such as January = 1 and December = 12.
        The second column will be the revenue that a lemonade stand makes in that month.
        Load the array with the following information.

        Jan = $34
        Feb = $44
        Mar = $23
        Apr = $76
        May = $65
        June = $98
        July = $123
        Aug = $102
        Sept = $87
        Oct = $43
        Nov = $34
        Dec = $12
         */

        //12 rows, 2 columns

        int data[][] = new int[12][2];

        data[0][0] = 1;
        data[1][0] = 2;
        data[2][0] = 3;
        data[3][0] = 4;
        data[4][0] = 5;
        data[5][0] = 6;
        data[6][0] = 7;
        data[7][0] = 8;
        data[8][0] = 9;
        data[9][0] = 10;
        data[10][0] = 11;
        data[11][0] = 12;

        data[0][1] = 34;
        data[1][1] = 44;
        data[2][1] = 23;
        data[3][1] = 76;
        data[4][1] = 65;
        data[5][1] = 98;
        data[6][1] = 123;
        data[7][1] = 102;
        data[8][1] = 87;
        data[9][1] = 43;
        data[10][1] = 34;
        data[11][1] = 12;

        System.out.println("Month " + data[0][0] + " has revenue of " + data[0][1]);
        System.out.println("Month " + data[1][0] + " has revenue of " + data[1][1]);
        System.out.println("Month " + data[2][0] + " has revenue of " + data[2][1]);
        System.out.println("Month " + data[3][0] + " has revenue of " + data[3][1]);
        System.out.println("Month " + data[4][0] + " has revenue of " + data[4][1]);
        System.out.println("Month " + data[5][0] + " has revenue of " + data[5][1]);
        System.out.println("Month " + data[6][0] + " has revenue of " + data[6][1]);
        System.out.println("Month " + data[7][0] + " has revenue of " + data[7][1]);
        System.out.println("Month " + data[8][0] + " has revenue of " + data[8][1]);
        System.out.println("Month " + data[9][0] + " has revenue of " + data[9][1]);
        System.out.println("Month " + data[10][0] + " has revenue of " + data[10][1]);
        System.out.println("Month " + data[11][0] + " has revenue of " + data[11][1]);


        //using a for loop to print out array contents:

        for(int i = 0; i <= 11; i++){ //loop through months of the year

            System.out.println("For month " + data[i][0] + ", revenue was $" + data[i][1]);
            //iterating through ROWS, and seconds brackets (0 and 1) represent COLUMNS

        }

    }
}
