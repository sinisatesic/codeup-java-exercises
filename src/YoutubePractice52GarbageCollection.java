import java.util.ArrayList;
import java.util.List;

public class YoutubePractice52GarbageCollection {
    /*
    Every computer has finite memory
    All apps use memory

    When we create a new object, for example, it goes into system resources and
    grabs a portion of memory (enough to hold an object of this size/stature), then
    creates and allocates to appropriate place

    //in theory, you could run out of memory and then get runtime error; no more memory to be allocated

    //there's a de-constructor which gives memory back to the system
    //up to programmer to give memory back to system when possible
    //give memory back/release it when you longer need it
    In Java, this process is transparent: called garbage collection

    If you start running low on memory, Java will release memory not being utilized
    This happens in background

     */

    //import java.io.File;
    //import java.io.FileNotFoundException;
    //import java.io.IOException;
    //import java.nio.file.Files;
    //import java.nio.file.Path;
    //import java.nio.file.Paths;
    //import java.sql.SQLOutput;
    //import java.util.List;
    //import java.util.Scanner;
    //import java.util.stream.Collectors;
    ////import static java.nio.file.Paths.get;
    //
    //public class ContactsManagerProject {
    //
    //    public static void main(String[] args) throws IOException {
    //
    //        //displayInfo method below (home screen):
    //        displayInfo();
    //
    //        //
    //
    ////        Path searchPath = Paths.get("data","contacts.txt");
    ////        List<String> contacts = Files.lines(searchPath).collect(Collectors.toList());
    ////
    ////        String searchContacts = getSearchInput();
    ////
    ////        displaySearchContactResult(searchContacts, contacts);
    //
    //    }
    //    //end of main
    //
    //
    //    //home "page" method
    //    public static void displayInfo() throws IOException {
    //        System.out.println("Welcome to da contactzzz\n");
    //
    //        Scanner menuInput = new Scanner(System.in);
    //
    //        int userInput;
    //        boolean displayInfo = true;
    //
    //        do {
    //            System.out.println("Select an option below:");
    //            System.out.println("\t[1] View contacts.");
    //            System.out.println("\t[2] Add a new contact.");
    //            System.out.println("\t[3] Search a contact by name.");
    //            System.out.println("\t[4] Delete an existing contact.");
    //            System.out.println("\t[5] Exit program.");
    //            userInput = menuInput.nextInt();
    //
    //            if (userInput == 1) {
    //                System.out.println("\n\tContacts are listed below:");
    //                displayContacts();
    //                displayInfo = false;
    //            } else if (userInput == 2) {
    //                System.out.println("\n\tPlease enter name of new contact:");
    //                displayInfo = false;
    //            } else if (userInput == 3) {
    //                System.out.println("\n\tSearching for someone, eh?");
    //                searchContacts();
    //                displayInfo = false;
    //            } else if (userInput == 4) {
    //                System.out.println("\n\tWhich contact would you like to delete?");
    //                displayInfo = false;
    //            } else if (userInput == 5) {
    //                System.out.println("\n\tGoodbaiii");
    //                displayInfo = false;
    //            } else {
    //                System.out.println("Not a valid input; please select from inputs 1 through 5");
    //
    //            }
    //        } while (displayInfo);
    //    }
    //
    //
    //    //Option 1 method:
    //    public static void displayContacts() throws IOException {
    //        Path contactPath = Paths.get("data", "contacts.txt");
    //        if (!Files.exists(contactPath)) {
    //            throw new IOException("File doesn't exist");
    //        }
    //
    //        List<String> fileLines = Files.readAllLines(contactPath);
    //        System.out.println(fileLines);
    //    }
    //
    //
    ////Option 2 method:
    //
    //
    //
    //
    //
    //    //Beginning of methods for Option 3 - searching for contact//
    //    public static void searchContacts() throws  IOException{
    //        Path searchPath = Paths.get("data","contacts.txt");
    //        List<String> contacts = Files.lines(searchPath).collect(Collectors.toList());
    //
    //        String searchContacts = getSearchInput();
    //
    //        displaySearchContactResult(searchContacts, contacts);
    //    }
    //
    //
    //    public static String getSearchInput() throws IOException{
    //        Scanner searchContacts = new Scanner(System.in);
    //        System.out.println("Who are you searching for?");
    //        String contactName = searchContacts.nextLine();
    //        searchContacts.close();
    //
    //        return contactName;
    //    }
    //
    //    public static void displaySearchContactResult(String searchString, List<String> contacts) throws  IOException {
    //        boolean inData = false;
    //        String userDisplay = "";
    //        for(String contact : contacts){
    //            if (contact.contains(searchString)) {
    //                inData = true;
    //                userDisplay = contact;
    //                break;
    //            }
    //        }
    //
    //        if (inData) {
    //            System.out.println("\n\tYarp, we have 'em! Below is contact info:\n" + userDisplay);
    //        } else {
    //            System.out.println("Narp, no such contact here braj");
    //        }
    //    }
    //    //end here for Option 3 methods - searching for contact
    //}
}
