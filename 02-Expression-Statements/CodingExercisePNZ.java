public class CodingExercisePNZ {
    public static void main(String[] args) {
        // Positive, Negative or Zero
        // Write a method called checkNumber with an int parameter number.
        // The method should not return any value, and it needs to print out:
        // "positive" if the parameter number is > 0
        // "negative" if the parameter number is < 0
        // "zero" if the parameter number is equal to 0
        // NOTE: The checkNumber method needs to be defined as public static.

        checkNumber(5);
        checkNumber(-10);
        checkNumber(0);

    }
    public static void checkNumber(int number) {
        if(number > 0) {
            System.out.println("positive");
        } else if(number < 0) {
            System.out.println("negative");
        } else if(number == 0) {
            System.out.println("zero");
        }
    }
}