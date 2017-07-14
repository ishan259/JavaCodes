class Cons{
private Cons(){
System.out.println("Private Constructor");
}
public Cons(int i, int j){
System.out.println("Public Constructor");
System.out.println(i+j);
}
public static void main(String args[]){
Cons c=new Cons(2,3);

}
}