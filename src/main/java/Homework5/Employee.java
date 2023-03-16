package Homework5;

public class Employee extends Person {
    double daySalary;
    int employeeYears;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double calculateOvertime(double hours) {
        if (employeeYears < 18) {
            return 0;
        } else {
            return ((daySalary / hours) * 1.5);
        }
    }

    public String showEmployeeInfo() {
        return (this.name + " is a " + this.getGender() + ", " + this.age + " years old. His day salary is: " + this.daySalary);
    }
}
