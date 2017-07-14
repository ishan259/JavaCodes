
class InheritA {
	int i=10;
	int j=20;
	int k=30;
}
class B extends InheritA{
		int i=40;
		int j=50;
		int k=60;
		void display()
		{
			System.out.println(i);
			System.out.println(j);
			System.out.println(k);
			System.out.println(super.i);
			System.out.println(super.j);
			System.out.println(super.k);
		}}
	class C{ 
	public static void main(String args[]){
		B o=new B();
		o.display();
	}
}
