public class MyClass {
public int multiply(int x, int y) {
	if(x>999){
		throw new IllegalArgumentException("X should be less than 1000");
		}
	return x*y;
}

public int add(int x,int y){
	return x+y;
}

public int subtract(int x,int y) {
	return x-y;
}
}
