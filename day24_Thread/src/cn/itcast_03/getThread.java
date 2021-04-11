package cn.itcast_03;

public class getThread implements Runnable{
  Student s;
	public getThread(Student s) {
		this.s=s;
	}
	@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(s.name+"---"+s.age);
		}
}
