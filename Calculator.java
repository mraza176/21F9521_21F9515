
public class Calculator {
	
	int add(int a, int b) {
		return a + b;
	}

	int sub(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(3, 5));
		
		System.out.println(calc.sub(8, 5));
	}

}
