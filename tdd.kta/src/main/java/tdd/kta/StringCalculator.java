package tdd.kta;

import java.io.Console;

public class StringCalculator {
	
	public int Add(String numbers) {
		int sum=0;
		try {
			if(numbers.isEmpty())
				sum=0;
			else {
				String[] num = numbers.split(",");
				for(String numString : num) {
					sum=sum + Integer.parseInt(numString);
				}
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return sum;
	}

}
