/*develop a personel management system that supports overriding and overloading of methods. Create an 
 * Employee class and inclue methods for figuring out the pay. For various employee kinds, create subclasses 
 * and override the salary computation mechanism...
  */
class Employee{
    String name;
    int employeeId;
    public Employee(String name, int emplyeeId){
        this.name = name;
        this.employeeId  = employeeId;
    }
    public double calculateSalary(){
        return 0.0;
    }
    public double calculateSalary(double bonus){
        return calculateSalary() + bonus;
    }
}
class FullTimeEmployee extends Employee{
    double monthlySalary;

    public FullTimeEmployee(String name, int emplyeeId, double monthlySalary){
        super(name, emplyeeId);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee{
    double hourlyRate;
    double hoursWorked;

    public PartTimeEmployee(String name, int emplyeeId, double hourlyRate, double hoursWorked){
        super(name, emplyeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary(){
        return hourlyRate * hoursWorked;
    }
}
public class Assignment6{
    public static void main(String[] args) {
        FullTimeEmployee fulltimeemployee = new FullTimeEmployee("Sourabh",101,5000);
        System.out.println(fulltimeemployee.calculateSalary(500));
        PartTimeEmployee parttimeemployee = new PartTimeEmployee("Shubham",102,20,5000);
        System.out.println(parttimeemployee.calculateSalary());
    }
}