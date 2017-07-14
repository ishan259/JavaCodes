
public class Printing {
public int print(int x){
	if(x==10){
		System.out.println("10");
		return x;
	}
	if(x==20){
		System.out.println("20");
		return x;}
	return 0;
	}
public String print1(int x){	
	if(x>50 && x<=100){
		System.out.println("50-100");
		return ("50-100");
	}
	if(x>100){
		System.out.println("I am more than 100");
			return ("I am more than 100");
				}
	return null;
}
}