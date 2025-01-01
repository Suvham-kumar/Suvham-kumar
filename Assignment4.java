import java.util.Scanner;
class Grader {
     int score;

    
    public Grader(int score) {
        this.score = score;
    }

    
    public String letterGrade() {
        if (score >= 90 && score <= 100) {
            return "O"; 
        } else if (score >= 80) {
            return "E"; 
        } else if (score >= 70) {
            return "A"; 
        } else if (score >= 60) {
            return "B"; 
        } else if (score >= 50) {
            return "C"; 
        } else {
            return "F"; 
        }
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a score between 0 and 100:");
        int userScore = sc.nextInt();

        if (userScore > 0 && userScore <100) {
            Grader grader = new Grader(userScore);
            System.out.println("The letter grade is: " + grader.letterGrade());
        } else {
            System.out.println("Invalid score! Please enter a value between 0 and 100.");
        }
    }
}
