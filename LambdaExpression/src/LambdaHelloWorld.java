
public class LambdaHelloWorld {
interface MathOperation {
	int operation(int a, int b);
}
private int operate(int a, int b, MathOperation mathOperation){
	return mathOperation.operation(a, b);
}

public static void main(String args[]) {
	LambdaHelloWorld tester=new LambdaHelloWorld();
	
	MathOperation addition = (int a,int b) -> a+ b;
	
	System.out.println("Lambda First Example! ");
	System.out.println("10+5 = " + tester.operate(10, 5, addition));
		
	}
}
 