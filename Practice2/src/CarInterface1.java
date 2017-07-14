
public interface CarInterface1 extends CarInterface{
	default void display(){
		System.out.println("Hello");
	}

}
