import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrintingTest {
	
	@Test
	public void testprint1(){
	Printing tester = new Printing();
	assertEquals("If x =10 ", 10, tester.print(10));
	}	
	
	@Test
	public void testprint2(){
	Printing tester = new Printing();
	assertEquals("If x =20", 20, tester.print(20));
	}
	
	@Test
	public void testprint3(){
		Printing tester = new Printing();
		assertEquals("50-100", tester.print1(51));
	}
	
	@Test
	public void testprint4(){
		Printing tester = new Printing();
		assertEquals("I am more than 100", tester.print1(101));
	}
	}

