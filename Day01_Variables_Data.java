public class Day01_Variables_Data {
    public static void main(String[] args) {
        // Variables & Data: a, b, x are containers storing values 10, 20, 11
        int a = 10;
        int b = 20;
        int x = 11; // Initially 11, but will change

        // Performing arithmetic operations
        x = b - a; // x becomes 10 (20 - 10)
        b = x - a; // b becomes 0  (10 - 10)

        // Output values
        System.out.println("value of a: " + a); // 10
        System.out.println("Value of b: " + b); // 0
        System.out.println("Value of x: " + x); // 10
    }
}
