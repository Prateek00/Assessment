package tdd.kta;

public class StringCalculator {
	
	public int Add(String numbers) {
		int sum=0;
		if(numbers.isEmpty())
			sum=0;
		else {
			String[] num = numbers.split(",");
			for(String numString : num) {
				sum=sum + Integer.parseInt(numString);
			}
		}
		return sum;
	}

}
