package tdd.kta;

import java.io.Console;

public class StringCalculator {
	
	public int Add(String numbers) {
		int sum=0;
		try {
			if(numbers.isEmpty())
				sum=0;
			else {
				String[] strings = numbers.split("\n");
				String delim= Character.toString(strings[0].charAt(2));
				String[] num = strings[1].split(delim); 
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
