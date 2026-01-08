Import java.util.Scanner*;
public class students marks{
public static void main(String[] args){
int maths,phy,che,eng,compsc;
double finalscore;
boolean finalscore;
Boolean result=true;
Scanner marks=new Scanner(System.in);
while(result)
{
System.out.println("Enter Marks for Maths:");
maths=marks.nextInt();
System.out.println("Enter Marks for Phy:");
phy=marks.nextInt();
System.out.println("Enter Marks for Che:");
che=marks.nextInt();
System.out.println("Enter Marks for eng:");
eng=marks.nextInt();
System.out.println("Enter Marks for compsc:");
compsc=marks.nextInt();
finalscore=(maths+eng+phy+che+compsc)/5;
if (finalscore>90)
System.out.println("Excellent");
else if (finalscore>80)
System.out.println("V.good")
else if(finalscore>60)
System.out.println("good")
else if(finalscore>40)
System.out.println("Average")
else
System.out.println("poor")
System.out.println("Any more students?(true or false)");
result=marks.nextBoolean();




