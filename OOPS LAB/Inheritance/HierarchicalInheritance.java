class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    int rollNumber;
    String grade;
    Student(String name, int age, int rollNumber, String grade) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    void displayStudent() {
        displayPerson();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}
class Teacher extends Person {
    String subject;
    double salary;
    Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }
    void displayTeacher() {
        displayPerson();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Student s = new Student("Keerthi", 19, 101, "A");
        Teacher t = new Teacher("Ramesh", 40, "Mathematics", 50000);
        System.out.println("Student Details:");
        s.displayStudent();
        System.out.println("\nTeacher Details:");
        t.displayTeacher();
    }
}