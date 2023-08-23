import java.text.DecimalFormat;

import java.text.NumberFormat;

public class Calculator {

	NumberFormat formatter = new DecimalFormat("#.00");

	public String calculateAverage(int[] calc) {

		int total = 0;

		for (int c : calc) {

			total = total + c;

		}

		double result = total / (double) calc.length;

		return formatter.format(result);

	}

	public String calculateAverage(double[] calc) {

		double total = 0;

		for (double c : calc) {

			total = total + c;

		}

		double result = total / calc.length;

		return formatter.format(result);

	}
	public static void main(String[] args) {
		double[] dAry = {3.2, 4.3, 7.1, -5.5};
		int[] iAry = {4,5,6,7,8,9};
		
		Calculator c = new Calculator();
		
		System.out.println(c.calculateAverage(dAry));
		System.out.println(c.calculateAverage(iAry));

	}

}
