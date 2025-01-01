import java.util.*;

// PrimeCalculator class to handle the calculation of prime numbers
class PrimeCalculate {
    private int start;
    private int end;

    // Constructor to initialize range
    public PrimeCalculate(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Method to check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        System.out.println(num);
        return true;
    }

    // Method to calculate the sum and count of prime numbers within the range
    public void calculatePrimes() {
        int Sum = 0;
        int Count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                Sum += i;
                Count++;
            }
        }

        // Output the results
        System.out.println("Total Prime Number: " + Count);
        System.out.println("Sum of all prime numbers: " + Sum);
    }
}

// Main class to run the program
public class Assignment2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input start and end range
        System.out.println("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.println("Enter the end of the range: ");
        int end = sc.nextInt();


            // Create an object of PrimeCalculator
            PrimeCalculate prime = new PrimeCalculate(start, end);

            // Calculate and display results
            prime.calculatePrimes();
        }

    }