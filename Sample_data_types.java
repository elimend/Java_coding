public class DataTypesExample {
    public static void main(String[] args) {
        // Declare and initialize some variables of different data types
        int num1 = 10;
        double num2 = 3.14;
        boolean flag = true;
        char letter = 'A';
        String text = "Hello, world!";

        // Demonstrate type conversion using casting
        int result1 = (int) num2; // Convert double to int using casting
        double result2 = (double) num1; // Convert int to double using casting
        int result3 = (int) letter; // Convert char to int using casting
        char result4 = (char) num1; // Convert int to char using casting

        // Output the results
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("flag: " + flag);
        System.out.println("letter: " + letter);
        System.out.println("text: " + text);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
    }
}
