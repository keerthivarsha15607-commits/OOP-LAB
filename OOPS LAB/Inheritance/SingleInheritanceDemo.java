class Person {
    String name;
    int age;

        Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

       void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String studentId;
    String course;

   
    Student(String name, int age, String studentId, String course) {
        super(name, age);  
        this.studentId = studentId;
        this.course = course;
    }

        void displayStudentDetails() {
        displayPersonDetails();  
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        
         Student s1 = new Student("Keerthi", 18, "CSE101", "Computer Science");

         s1.displayStudentDetails();
    }
}