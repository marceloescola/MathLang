import java.util.Arrays;
import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors


public class App {
    public static void main(String[] args) {
        Arrayp transf = new Arrayp();
        /* import our class function as transf
        String numbers = "1 2 3 6 8 2 9";
        */
        //take numbers from txt
        //just declare data so we can use it outside try
        String data = "";
        try {
            //takes file
            File numbers = new File(".txt");
            //scanner for file
            Scanner reader = new Scanner(numbers);

            while (reader.hasNextLine()) {
                data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch(FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        //split
        String[] numlist = data.split(" ");
        int summed = 0;
        for (String i : numlist) {
            //makes i a int a sum it with summed
            summed += Integer.parseInt(i);
        }
        //we use transf.transform(numlist) to print the list using the class we did.
        System.out.println("Content: " + transf.transform(numlist));
        System.out.println("Result: " + summed); 
    }

}

//This class is like a function to print lists
class Arrayp {
    //Say that the function needs a list
    String[] list;

    //Makes a function that transforms a list into a printable array
    public String transform(String[] list) {
        return Arrays.toString(list);
    }
}