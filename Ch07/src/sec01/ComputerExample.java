package sec01;

public class ComputerExample {
	public static void main(String[] args) {		
		int r = 10;		
		Calculator calculator = new Calculator();
		System.out.println("������ : " + calculator.areaCircle(r));		
		System.out.println();		
		Computer computer = new Computer();
		System.out.println("������ : " + computer.areaCircle(r));
	}
}

