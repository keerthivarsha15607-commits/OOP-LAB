class Student {
    private String name;
    private int marks;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int m) {
        if (m >= 0 && m <= 100) {
            marks = m;
        }
    }

    public int getMarks() {
        return marks;
    }
}

public class EncapsulationDemo2 {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Keerthi");
        s.setMarks(85);

        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}