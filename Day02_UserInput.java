import java.util.Scanner;

public class Day02_UserInput {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     //input your name
        System.out.print("Enter your Name :");
        // name is a string type.
        String name = scanner.nextLine();
        System.out.println("Hello " + name );


    }
}
