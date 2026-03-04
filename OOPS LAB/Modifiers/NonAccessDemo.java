abstract class Test {

    final int x = 100;              
    static int y = 50;              
    abstract void display();     
}

class Child extends Test {

    @Override
    void display() {
        System.out.println("Final x = " + x);
        System.out.println("Static y = " + y);
    }
}

public class NonAccessDemo  {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
