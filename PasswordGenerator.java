public class PasswordGenerator {

    // Create methods to generate:
    // 1. A random lowercase letter
    public static char getRandomLower() {
        return (char) (int) (Math.random() * (26) + 97);
    }
    // 2. A random uppercase letter
    public static char getRandomUpper() {
        return (char) (int) (Math.random() * (26) + 65);
    }
    // 3. A random digit character
    public static char getRandomDigit() {
        return (char) (int) (Math.random() * (10) + 48);
    }
    // 4. A random special character from: !@#$%^&*
    public static char getRandomSpecial() {
        while (true) {
            char ch = (char) (int) (Math.random() * (94) + 33);
            if ("!@$%^&*".contains(String.valueOf((ch)))) {
                return ch;
            }
        }
    }
    // 5. A method that generates a password of specified length
    //    containing a mix of all character types
    public static String generatePassword (int len) {
        String password = "";
        for (int i = 0; i < len; i++){
            password +=  (char) (int) (Math.random() * (94) + 33);
        }
        return password;
    }

    public static void main(String[] args) {
        System.out.println("Random lowercase: " + getRandomLower());
        System.out.println("Random uppercase: " + getRandomUpper());
        System.out.println("Random digit: " + getRandomDigit());
        System.out.println("Random special: " + getRandomSpecial());
        System.out.println("8-character password: " + generatePassword(8));
    }
}