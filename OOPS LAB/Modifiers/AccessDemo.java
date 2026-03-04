class AccessDemo {

    public int a = 10;      
    private int b = 20;    
    protected int c = 30;  
    int d = 40;           

    public void show() {
        System.out.println("Public a: " + a);
        System.out.println("Private b: " + b);
        System.out.println("Protected c: " + c);
        System.out.println("Default d: " + d);
    }
}

public class Main {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.show();

        System.out.println(obj.a);   
        System.out.println(obj.b);
        System.out.println(obj.c);   
        System.out.println(obj.d);   
    }
}
