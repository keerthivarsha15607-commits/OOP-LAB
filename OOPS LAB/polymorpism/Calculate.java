class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    protected void display() {
        System.out.println("This is protected class display method");
    }
    private void show() {
        System.out.println("This is private class display method");
    }
    public void accessPrivate() {
        show();
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    public int add(int a, int b) {
        return a + b + 10;
    }
    @Override
    protected void display() {
        System.out.println("This is AdvancedCalculator display method");
    }
    public void show() {
        System.out.println("This is show() method in AdvancedCalculator");
    }
}

public class Calculate {
    public static void main(String[] args) {
        Calculator obj1 = new Calculator();
        System.out.println("Calculator add: " + obj1.add(5, 3));
        obj1.display();
        obj1.accessPrivate();
        System.out.println();
        AdvancedCalculator obj2 = new AdvancedCalculator();
        System.out.println("AdvancedCalculator add: " + obj2.add(5, 3));
        obj2.display();
        obj2.show();
        System.out.println();
        Calculator obj3 = new AdvancedCalculator(); 
        System.out.println("Runtime Polymorphism add: " + obj3.add(5, 3));
        obj3.display();
    }
}