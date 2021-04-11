package cn.itcast_03;

public class setThread implements Runnable{
	 Student s;
	 public setThread(Student s) {
		 this.s=s;
	 }
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		s.age=27;
		s.name="ÁÖÇàÏ¼";
	}
}
