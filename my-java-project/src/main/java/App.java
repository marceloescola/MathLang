import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        //import our class function as transf
        Arrayp transf = new Arrayp();
        String numbers = "1 2 3 6 8 2 9";

        //split
        String[] numlist = numbers.split(" ");
        int summed = 0;
        for (String i : numlist) {
            System.out.println(i);
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