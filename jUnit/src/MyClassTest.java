import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyClassTest {
@Test (expected = IllegalArgumentException.class)
public void testExceptionIsThrown(){
	MyClass tester= new MyClass();
	tester.multiply(1000, 5);
}

@Test
public void testMultiply(){
	MyClass tester=new MyClass();
	assertEquals("10 x 5 must be 50", 50, tester.multiply(10,5));
	}

@Test
public void testAdd(){
	MyClass tester=new MyClass();
	assertEquals("10 + 5 must be 15", 15, tester.add(10,5));
	}

@Test
public void testSubtract(){
	MyClass tester=new MyClass();
	assertEquals("10-5 must be 5", 5, tester.subtract(10, 5));
}
}
