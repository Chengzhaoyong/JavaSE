package shiyan05;

public class ShiYan08 {
public static void main(String[] args) {
	try {
		mb_method();
	}catch(Exception e) {
		System.out.println('m');
	}
	System.out.println('n');
}
  static void MyException() {
	  throw new ArrayIndexOutOfBoundsException();
  }
  static void mb_method() {
	  try {
		  MyException();
		  System.out.println('a');
	  }
	  catch(ArithmeticException e) {
		  System.out.println('b');
	  }finally {
		  System.out.println('c');
	  }
	  System.out.println('d');
  }
}
