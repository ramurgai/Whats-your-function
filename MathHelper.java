public class MathHelper {
    // TODO: Implement these methods

    // 1. Create a method called 'calculateSum' that takes two integers
    //    and returns their sum
    public static int calculateSum(int int1, int int2){
        return int1 + int2;
    }
    // 2. Create a method called 'findMin' that takes two integers
    //    and returns the smaller one
    public static int findMin(int int1, int int2){
        if (int1 < int2){
            return int1;
        }
        else{
            return int2;
        }
    }

    // 3. Create a void method called 'printResult' that takes an integer
    //    and prints "The result is: [number]"
    public static void printResult (int printInt){
        System.out.println("The result is: [" + printInt + "]");
    }
    public static void main(String[] args) {
        // Test your methods here
        int sum = calculateSum(15, 25);
        int min = findMin(10, 20);
        printResult(sum);
        printResult(min);
    }
}