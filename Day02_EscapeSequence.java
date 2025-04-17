public class Day02_EscapeSequence {
    public static void main(String[] args) {

        // Tab space
        System.out.println("Hello\tWorld");
        // Output: Hello    World

        // New line
        System.out.println("Line1\nLine2");
        // Output:
        // Line1
        // Line2

        // Backspace (removes last character before \b)
        System.out.println("ABC\bD");
        // Output: ABD  (removes C)

        // Double quote inside a string
        System.out.println("He said, \"Java is awesome!\"");
        // Output: He said, "Java is awesome!"

        // Single quote inside a string
        System.out.println("It\'s Java time!");
        // Output: It's Java time!

        // Backslash
        System.out.println("This is a backslash: \\");
        // Output: This is a backslash: \

        // Carriage return (replaces the start of the line with what comes after \r)
        System.out.println("12345\rABCDE");
        // Output: ABCDE (replaces 12345)

    }
}
