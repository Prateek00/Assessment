package tdd.kta;

import org.junit.Test;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class StringCalculatorTest {
 
 private StringCalculator stringCalculator = new StringCalculator();
 
@Test
 public void testAdd() {
	 assertEquals(4, stringCalculator.Add("//;\\n-1;5"));
 }
 
}
