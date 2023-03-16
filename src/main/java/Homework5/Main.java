package Homework5;

public class Main {
    public static void main(String[] args) {
        Person personArray[] = new Person[10];

        Person person1 = new Person("Josh", 23, true);
        Person person2 = new Person("Alina", 31, false);

        Student student1 = new Student("Zara", 18, false, 5.00);
        Student student2 = new Student("Michael", 21, true, 4.75);

        Employee employee1 = new Employee("Nick", 41, true, 60);
        Employee employee2 = new Employee("Adrian", 37, true, 75);

        personArray[0] = person1;
        personArray[1] = person2;
        personArray[2] = student1;
        personArray[3] = student2;
        personArray[4] = employee1;
        personArray[5] = employee2;

        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i] instanceof Student) {
                Student student = (Student) personArray[i];
                System.out.println(student.showStudentInfo());
            } else if (personArray[i] instanceof Employee) {
                Employee employee = (Employee) personArray[i];
                System.out.println(employee.showEmployeeInfo());
            } else if (personArray[i] instanceof Person) {
                System.out.println(personArray[i].showPersonInfo());
            }
        }
    }
}
