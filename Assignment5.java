
import java.util.Scanner;

class Staff{
    int code;
    String name;

    Staff(int code, String name){
        this.code = code;
        this.name = name;
    }
    public void display(){
        System.out.println("The code of an Employee: " + code);
        System.out.println("The name of an Employee: " + name);
    }
}
class Teacher extends Staff{
    String subject;
    String publication;

    Teacher(int code, String name, String subject, String publication){
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }
}
class Officer extends Staff{
    String grade;

    Officer(int code, String name, String grade){
        super(code, name);
        this.grade = grade;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("The Grade of the Officer is: " + grade);
    }
}
class Typist extends Staff{
    int speed;
    
    Typist(int code, String name, int speed){
        super(code, name);
        this.speed = speed;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Typing speed in term of word per minute: " + speed);
    }
}
class RegularTypist extends Typist{
    double remuneration;

    RegularTypist(int code, String name, int speed, double remuneration){
        super(code, name, speed);
        this.remuneration = remuneration;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Remuneration: " + remuneration);
    }
}
class CasualTypist  extends Typist{
    double dailyWages;

    CasualTypist(int code, String name, int speed, double dailyWages){
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("DailyWages: " + dailyWages);
    }
}
public class Assignment5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teacher Information");
        System.out.println("The Code of the Teacher: ");
        int code = sc.nextInt();
        System.out.println("The name of the Teacher is: ");
        String name = sc.next();
        System.out.println("The Teacher teaches the subject is: ");
        String subject = sc.next();
        System.out.println("The teacher publish the book is: ");
        String publication = sc.next();
        Teacher teacher = new Teacher(code, name, subject, publication);
        teacher.display();
        System.out.println("-------------------------------------------");

        System.out.println("Officer Information");
        System.out.println("The Code of the Officer: ");
        int code1 = sc.nextInt();
        System.out.println("The name of the Officer is: ");
        String name1 = sc.next();
        System.out.println("The Grade Officer is: ");
        String grade = sc.next();
        Officer officer = new Officer(code1, name1, grade);
        officer.display();
        System.out.println("-------------------------------------------");

        System.out.println("RegularTypist Information");
        System.out.println("The Code of the RegularTypist: ");
        int code2 = sc.nextInt();
        System.out.println("The name of the RegularTypist is: ");
        String name2 = sc.next();
        System.out.println("The speed of the RegularTypist is: ");
        int speed = sc.nextInt();
        System.out.println("The remuneration of the RegularTypist is: ");
        double remuneration = sc.nextDouble();
        RegularTypist regularTypist = new RegularTypist(code2, name2, speed, remuneration);
        regularTypist.display();
        System.out.println("-------------------------------------------");

        System.out.println("CasualTypist Information");
        System.out.println("The Code of the CasualTypist: ");
        int code3 = sc.nextInt();
        System.out.println("The name of the CasualTypist is: ");
        String name3 = sc.next();
        System.out.println("The speed of the CasualTypist is: ");
        int speed1 = sc.nextInt();
        System.out.println("The dailyWages of the CasualTypist is: ");
        double dailyWages = sc.nextDouble();
        CasualTypist casualTypist = new CasualTypist(code3, name3, speed1, dailyWages);
        casualTypist.display();
        System.out.println("-------------------------------------------");
    }
}