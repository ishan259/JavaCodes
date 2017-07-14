
public class TestSuite1 {
private String message;
public TestSuite1(String message){ //constructor

this.message=message;
}
public String printMessage(){
	System.out.println(message);
	return message;
}
public String salutationMessage(){
	message = "Hi"+message;
	System.out.println(message);
	return message;
	}
}
