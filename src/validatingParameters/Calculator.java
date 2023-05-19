package validatingParameters;

public class Calculator {
    public static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Invalid number. Number must not be negative. ");
        }

        int result = 1;
        for (int i =1; i <= number; i++){
            result = i;
        }
        return result;
    }

    public static int binomialCoefficient(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0 || subsetSize > setSize) {
            throw new IllegalArgumentException("Invalid. Set size and subset size can't be negative, and subset size must not exceed set size.");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);
        return numerator / denominator;
    }

}
