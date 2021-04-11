package shiyan05;

public class ShiYan03 {
	public static void main(String[] args) {
	try {
		for(int i=0;i<3;i++) {
			System.out.println("The value of i:"+i);
			System.out.println(5/i);
		}
	}catch(ArithmeticException e) {
		System.out.println("Division by Zero");
	}
	System.out.println("---------");
	for(int i=0;i<3;i++) {
		try {
			
				System.out.println("The value of i:"+i);
				System.out.println(5/i);
		}catch(ArithmeticException e) {
			System.out.println("Division by Zero");
		}
	}
	}
}
