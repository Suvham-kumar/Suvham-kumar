import java.util.*;

class Calculator {

    public int add(int x, int y) {
        int sum=x+y;
        return sum;
    }
    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        if (y == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return x / y;
    }
}

public class Assignment1 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        System.out.println("Enter the value of A: ");
        int A = sc.nextInt();
        System.out.println("Enter the value of B: ");
        int B = sc.nextInt();

        int choice;
        do{
        System.out.println("Choose the Option");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");

        choice=sc.nextInt();

        switch(choice){
            case 1:
            System.out.println("The Addition is " + cal.add(A,B));
            break;

            case 2:
            System.out.println("The Subtraction is " + cal.subtract(A,B));
            break;

            case 3:
            System.out.println("The Multiplication is " + cal.multiply(A,B));
            break;

            case 4:
            System.out.println("The Division is " + cal.divide(A,B));
            break;
        }
    }
    while(choice!=5);
    }
}