
public class Calculator {

	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1-num2;
	}
	public static int mul(int num1, int num2) {
		return num1*num2;
	}
	public static int div(int num1, int num2) {
		return num1/num2;
	}
	
}
class main
{

	public static void main(String[] args) {
		
		Calculator.add(2,4);
		Calculator.sub(5,3);
		Calculator.mul(3, 2);
		Calculator.div(10, 2);

	}
}
