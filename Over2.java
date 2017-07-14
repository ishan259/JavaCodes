class Over1{
int add(int a, int b){
int sum=a+b;
return sum;
}
}
class Over2 extends Over1{
int add(int c, int d , int e){
int sum=c+d+e;
return sum;
}
public static void main(String args[]){
	Over2 obj2 = new Over2();
	int a = obj2.add(4,5);
System.out.println(a);
System.out.println(obj2.add(4,5,6));
}
}