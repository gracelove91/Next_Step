package calculatorTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import calculator.StringCalculator;

public class StringCalculatorTest {
	private StringCalculator cal;
	
	@Before
	public void setup() {
		cal = new StringCalculator();
	}
	
	
	@Test
	public void add_NULL_또는_빈문자() {
		assertEquals(0, cal.add(""));
		assertEquals(0, cal.add(null));
	}
	
	@Test
	public void add_숫자하나() {
		assertEquals(1, cal.add("1"));
	}
	
	@Test
	public void add쉼표구분자(){
		assertEquals(3, cal.add("1,2"));
		
	}
	@Test
	public void add쉼표와세미콜론함께쓰는구분자() {
		assertEquals(8, cal.add("1,3;4"));
	}
	
	@Test
	public void add_custom() {
		assertEquals(9, cal.add("//-\n2-3-4"));
	}
	
	@Test(expected = RuntimeException.class)
	public void add_negative() throws Exception {
		cal.add("-1,2;3");
	}
	

	

}
