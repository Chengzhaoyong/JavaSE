package cn.itcast_04;

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
			if(!s.flag) {
				try {
					s.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(s.name+"---"+s.age);
			
			s.flag=false;
			s.notify();
		}
}
}}