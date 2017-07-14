import java.util.Scanner;
class AreaCalculate {
public static void main(String args[])
{
System.out.println("Enter your choice");
Scanner sc=new Scanner(System.in);
String shape=sc.nextLine();

switch(shape)
{
case "circle":
Circle ob1=new Circle();
ob1.area();
break;

case "rectangle":
Rectangle ob2=new Rectangle();
ob2.area();
break;

case "square":
Square ob3=new Square();
ob3.area();
break;
default:System.out.println("INVALID");
}

}
}