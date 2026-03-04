public class Car{
String model;
int year;
public Car(String model,int year){
this.model = model;
this.year = year;
}
public void dispalyInfo(){
System.out.println("Model:"+ model +",Year:"+year);
}
public static void main(String[]args){
Car myCar = new Car("Toyota",2021);
myCar.displayInfo();
}
}