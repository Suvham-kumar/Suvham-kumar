
import java.util.Scanner;



interface Exam{
    void percent_cal();
}
class Student{
    String name;
    int roll_no;
    int marks1;
    int marks2;

    public Student(String name, int roll_no, int marks1, int marks2){
        this.name = name;
        this.roll_no = roll_no;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks: " + marks1);
        System.out.println("Marks2: " + marks2);
    }
}
class Result extends Student implements Exam{
    double percentage;

    public Result(String name, int roll_no, int marks1, int marks2, double percentage){
        super(null, roll_no, marks1, marks2);
    }

    public void percent_cal(){
        percentage = (marks1 + marks2)/2;
    }

    public void per_display(){
        super.display();
        System.out.println("Percentage: " + percentage);
    }
}
public class Assignment7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = sc.next();
        System.out.println("Enter the Roll No: ");
        int roll_no = sc.nextInt();
        System.out.println("Enter the Marks1: ");
        int marks1 = sc.nextInt();
        System.out.println("Enter the Marks2: ");
        int marks2 = sc.nextInt();

        Result result = new Result(name, roll_no, marks1, marks2, marks2);
        result.percent_cal();
        result.per_display();
    }
}