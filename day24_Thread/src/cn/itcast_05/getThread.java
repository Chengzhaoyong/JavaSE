package cn.itcast_05;

public class getThread implements Runnable{
  Student s;
	public getThread(Student s) {
		this.s=s;
	}
	@Override
		public void run() {
		while(true) {
			// TODO Auto-generated method stub
		synchronized (s) {
			s.get();
		}
}
}}