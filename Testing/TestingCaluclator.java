import static org.junit.Assert.*;

import org.junit.Test;

import calc.Calculator;

public class TestingCalculator {

		Calculator test=new Calculator();
		
		@Test		
		public void addition_test() {
			assertEquals("wrong answer please check the addition fuction",18.6,test.addition(10,8.6),0.0);
			assertEquals("wrong answer please check the addition fuction",126.4,test.addition(90.9,35.5),0.0);
			assertEquals("wrong answer please check the addition fuction",4953422.51,test.addition(987546.256,3965876.254),0.0);
		}
		
		@Test
		public void division_test()
		{
			assertEquals("wrong answer please check the division fuction",7.5,test.division(30, 4),0.0);
			assertEquals("wrong answer please check the division fuction",49.06923076923077,test.division(956.85,19.5),0.0);
			assertEquals("wrong answer please check the division fuction",1.4415781487101669,test.division(95,65.9),0.0);
		}
		
		@Test
		public void multiplication_test()
		{
			assertEquals("wrong answer please check the multipcation fuction",765,test.multiplication(90 , 8.5),0.0);
			assertEquals("wrong answer please check the multipcation fuction",9773.44304,test.multiplication(99.364 , 98.36),0.0);
			assertEquals("wrong answer please check the multipcation fuction",5285.1123,test.multiplication(852.3 , 6.201),0.0);
		}
	}


