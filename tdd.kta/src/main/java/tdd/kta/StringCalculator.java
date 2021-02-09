package tdd.kta;

import java.io.Console;

public class StringCalculator {
	
	public int Add(String numbers) throws Exception {
		int sum=0;
		try {
			if(numbers.isEmpty())
				sum=0;
			else {
				String[] strings = numbers.split("\n");
				String delim= strings[0].substring(3, strings[0].length()-2);
				String[] num = strings[1].split(delim); 
				for(String numString : num) {
					
					int n = Integer.parseInt(numString);
					if(n>=0 && n<1000) {
						sum+=n;
					}
					else {
						throw new Exception("Neative number");
					}
				}
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return sum;
	}

}
