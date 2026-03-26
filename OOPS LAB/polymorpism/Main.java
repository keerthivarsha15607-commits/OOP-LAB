class calculator {
    public int add(int a, int b) {
        return a + b;
    }

    protected int add(int a, int b, int c) {
        return a + b + c;
    }

    private double add(double a, double b) {
        return a + b;
    }

    public void decimal(double a, double b) {
        double result = add(a, b);
        System.out.println("sum of decimals: " + result);
    }
}

public class Main { 
    public static void main(String[] args) {
        calculator obj = new calculator();

        System.out.println("Sum of 2 no: " + obj.add(10, 29));
        System.out.println("Sum of 3 no: " + obj.add(10, 20, 30));
        obj.decimal(3.5, 5.5);
    }
}