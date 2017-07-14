import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestSuite3 {
	String message = "Robert";
	TestSuite1 messageUtil = new TestSuite1(message);
	@Test
	public void testPrintMessage()
	{ System.out.println("inside testsalutationMessage()");
	message="Hi"+"Robert";
	assertEquals(message,messageUtil.salutationMessage());
	}

	}