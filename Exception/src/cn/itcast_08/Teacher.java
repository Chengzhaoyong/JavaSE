package cn.itcast_08;

public class Teacher {
    //���MyException�̳�RuntimeException
//			public void check(int score) {
//				if(score>100||score<0) {
//					throw new MyException();
//				}
//				else {
//					System.out.println("û������");
//				}
//			}
			
	public void check(int score) throws MyException{
		if(score>100||score<0) {
			throw new MyException("����������0-100");
		}
		else {
			System.out.println("û������");
		}
}
	


}