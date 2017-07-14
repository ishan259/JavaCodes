import java.io.*;
import java.util.*;
class File{
public static void main(String args[]){
try{
FileInputStream i=new FileInputStream("D:\\Ishan\\Collections\\Read.txt");
String s=i.read();
System.out.println(s);
i.close();
}
catch(Exception e)
{
System.out.println(e);}
}
}