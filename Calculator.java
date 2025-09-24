public class Calculator {
    // TODO: Create multiple versions of a 'multiply' method that can handle:
    // 1. Two integers
    public static int multiply (int int1, int int2){
        return int1 * int2;
    }
    // 2. Three integers
    public static int multiply (int int1, int int2, int int3){
        return int1 * int2 * int3;
    }
    // 3. Two double values
    public static double multiply (double double1, double double2){
        return double1 * double2;
    }
    // 4. An integer and a string (repeat the string that many times)
    public static String multiply (int repeat, String message){
        String full = "";
        for (int i = 0; i < repeat; i++){
            full += message;
        }
        return full;
    }

    public static void main(String[] args) {
        // Test all your overloaded methods
        System.out.println("Two ints: " + multiply(5, 3));
        System.out.println("Three ints: " + multiply(5, 3, 2));
        System.out.println("Two doubles: " + multiply(5.5, 3.2));
        System.out.println("Int and string: " + multiply(3, "Hi!"));
    }
}