package Worldline.Assignment4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {
	
	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		int result = 10;
		int expect=calc.addFunc(5, 5);
		Assert.assertEquals(expect, result);
		
	}
	
	@Test
	public void subTest() {
		Calculator calc = new Calculator();
		int result = 10;
		int expect=calc.subFunc(15, 5);
		Assert.assertEquals(expect, result);
		
	}
	
	@Test
	public void mulTest() {
		Calculator calc = new Calculator();
		int result = 25;
		int expect=calc.multFunc(5, 5);
		Assert.assertEquals(expect, result);
		
	}
	
	@Test
	public void divTest() {
		Calculator calc = new Calculator();
		int result = 3;
		int expect=calc.divFunc(15, 5);
		Assert.assertEquals(expect, result);
		
	}

}
