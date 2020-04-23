package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public Input(Scanner scanner) {
        Input.scanner = scanner;
    }


    public Input() {
        setScanner();
    }

    private static void setScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
    }

    public String getString(String prompt) {
        if (scanner == null) setScanner();
        String s;

        // enter the string
        if (prompt != null) {
            System.out.print(prompt);
        } else {
            prompt = "Enter a string ";
        }
        s = scanner.nextLine();
        if (s.length() == 0)
            s = getString(prompt);
        return s;
    }


    public String getString() {
        return getString(null);
    }



    public boolean yesNo(String prompt) {
        if (scanner == null) setScanner();
        boolean response;

        // enter the string
        if (prompt != null) {
            System.out.print(prompt);
        }
        response = scanner.nextLine().toLowerCase().contains("y");
        return response;
    }


    public boolean yesNo() {
        return yesNo(null);
    }


    public int getInt(String prompt) {
        if (scanner == null) setScanner();
        String userInput;
        int num;

        // enter the number
        if (prompt != null) {
            System.out.print(prompt);
        }
        try { // If (works)
            userInput = scanner.nextLine();
            num = Integer.parseInt(userInput);
        } catch (Exception e) {
            System.out.println("That is not an integer.");
            if (prompt == null)
                prompt = "Enter an integer: ";
            num = getInt(prompt);
        }
        return num;
    }


    public int getInt() {
        return getInt(null);
    }


    public int getInt(int min, int max, String prompt) {
        if (scanner == null) setScanner();
        int num = getInt(prompt);
        if (num < min || num > max) {
            System.out.printf("\nThe number %d is out of range\n", num);
            if (prompt == null)
                prompt = String.format("Enter an integer between %d and %d: ", min, max);
            num = getInt(min, max, prompt);
        }
        return num;
    }


    public int getInt(int min, int max) {
        return getInt(min, max, null);
    }


    public double getDouble(String prompt) {
        if (scanner == null) setScanner();
        String userInput;
        double num;
        if (prompt != null)
            System.out.print(prompt);
        try {
            userInput = scanner.nextLine();
            num = Double.parseDouble(userInput);
        } catch (Exception e) {
            System.out.println("That is not a real number.");
            if (prompt == null)
                prompt = "Enter a real number: ";
            num = getDouble(prompt);
        }
        return num;
    }


    public double getDouble() {
        return getDouble(null);
    }


    public double getDouble(double min, double max, String prompt) {
        if (scanner == null) setScanner();
        double num;
        num = getDouble(prompt);
        if (num < min || num > max) {
            System.out.printf("\nThe number %f is out of range\n", num);
            if (prompt == null)
                prompt = String.format("Enter a real number between %f and %f: ", min, max);
            num = getDouble(min, max, prompt);
        }
        return num;
    }


    public double getDouble(double min, double max) {
        return getDouble(min, max, null);
    }


    public int getBinary(String prompt) {
        if (scanner == null) setScanner();
        String userInput;
        int num;

        // enter the number
        if (prompt != null) {
            System.out.print(prompt);
        }
        try { // If (works)
            userInput = scanner.nextLine();
            num = Integer.valueOf(userInput, 2);
        } catch (Exception e) {
            System.out.println("That is not a binary number.");
            if (prompt == null)
                prompt = "Enter a binary number: ";
            num = getBinary(prompt);
        }
        return num;
    }


    public int getBinary() {
        return getBinary(null);
    }


    public int getBinary(String min, String max, String prompt) {
        if (scanner == null) setScanner();
        int num = getBinary(prompt);
        if (num < Integer.valueOf(min, 2) || num > Integer.valueOf(max, 2)) {
            System.out.printf("\nThe number %d is out of range\n", num);
            if (prompt == null)
                prompt = String.format("Enter an binary number between %s and %s: ", min, max);
            num = getBinary(min, max, prompt);
        }
        return num;
    }

    public int getBinary(String min, String max) {
        return getBinary(min, max, null);
    }


    public int getHex(String prompt) {
        if (scanner == null) setScanner();
        String userInput;
        int num;

        // enter the number
        if (prompt != null) {
            System.out.print(prompt);
        }
        try { // If (works)
            userInput = scanner.nextLine();
            num = Integer.valueOf(userInput, 16);
        } catch (Exception e) {
            System.out.println("That is not a hex number.");
            if (prompt == null)
                prompt = "Enter a hex number: ";
            num = getHex(prompt);
        }
        return num;
    }


    public int getHex() {
        return getHex(null);
    }


    public int getHex(String min, String max, String prompt) {
        if (scanner == null) setScanner();
        int num = getHex(prompt);
        if (prompt != null) {
            System.out.print(prompt);
        }
        if (num < Integer.valueOf(min, 16) || num > Integer.valueOf(max, 16)) {
            System.out.printf("\nThe number %d is out of range\n", num);
            if (prompt == null)
                prompt = String.format("Enter a hex number between %s and %s: ", min, max);
            num = getHex(min, max, prompt);
        }
        return num;
    }


    public int getHex(String min, String max) {
        return getHex(min, max, null);
    }
}
