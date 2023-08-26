package day05_Operator;

public class ArithmeticOperators {

	public static void main(String[] args) {

		// +, -, *, /, %, ++, --
		// Addition (+)
		int num1 = 10;
		int num2 = 5;
		int num3 = 3;
		double num4 = 9.9;

		System.out.println(num1 + num2);

		int result = num1 + num2;
		int result2 = result + num3;
		double result3 = num1 + num4;
		int result4 = (int) (num1 + num4);

		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

		// Subtraction (-)
		System.out.println(num1 - num2 - num3);
		System.out.println(num3 - num1);

		int a = 5;
		int b = 7;
		double c = a * b;
		double d = a / b;

		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println("C: " + c);
		System.out.println("D: " + d);

		// Remainder (%)

		System.out.printf("%.2f", 10.0 / 3.0);
		System.out.println();
		System.out.println(10 % 3);
		System.out.println(10 % 2);
		System.out.println(10 / 3);

		// Increment (++) and Decrement (--)

		a = 1;
		System.out.println(a);
		a++;
		System.out.println(a);
		
		a = 5;
		System.out.println(a);
		a--;
		System.out.println(a);
		
		int index = 0;
		System.out.println(index);

	}

}
