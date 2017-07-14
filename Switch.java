import java.util.Scanner;
class Switch{
public static void main(String args[]){
System.out.println("Press X,Y or Z");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
switch(s){
case "x":
System.out.println("Hi");
break;
case "y":
System.out.println("Hi Hi");
break;
case "z":
System.out.println("Hello");
break;
}
}
}