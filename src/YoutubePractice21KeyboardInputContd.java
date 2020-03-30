import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class YoutubePractice21KeyboardInputContd {

    public static void main(String[] args)
    throws java.io.IOException {

        char input;

        System.out.println("Press any key, then press enter");
        input = (char) System.in.read();
        System.out.println("You entered the key: " + input);

        System.out.println("Press any second key");
        input = (char) System.in.read();
        System.out.println("Second key is: "+ input); //with this syntax, this second input will skip
    }
}
