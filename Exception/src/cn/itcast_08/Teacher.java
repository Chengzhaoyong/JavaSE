package cn.itcast_08;

public class Teacher {
    //针对MyException继承RuntimeException
//			public void check(int score) {
//				if(score>100||score<0) {
//					throw new MyException();
//				}
//				else {
//					System.out.println("没有问题");
//				}
//			}
			
	public void check(int score) throws MyException{
		if(score>100||score<0) {
			throw new MyException("分数必须在0-100");
		}
		else {
			System.out.println("没有问题");
		}
}
	


}