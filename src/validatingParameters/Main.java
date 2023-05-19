package validatingParameters;

import validatingParameters.Calculator;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Daniel", 24);
            System.out.println( person.getName() + " is " + person.getAge() + " years old.");
            Calculator calculator = new Calculator();

            int factorialResult = calculator.factorial(5);
            int binomialCoefficientResult = calculator.binomialCoefficient(10, 5);

            System.out.println("Factorial: " + factorialResult);
            System.out.println("Binomial Coefficient: " + binomialCoefficientResult);
        } catch (IllegalArgumentException e) {
            System.out.println("An error: " + e.getMessage());
        }
    }
}
