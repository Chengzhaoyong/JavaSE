package shiyan05;

public class ShiYan11 {
		public static void main(String[] args) {
			try {
				throw new ExceptionDemo("�������쳣");
			}catch(ExceptionDemo e) {
				System.out.println(e.getmessage());
			}
		}
}
