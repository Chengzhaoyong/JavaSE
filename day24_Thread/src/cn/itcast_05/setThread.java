package cn.itcast_05;

public class setThread implements Runnable{
	 Student s;
	 int x=0;
	 public setThread(Student s) {
		 this.s=s;
	 }
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		 while(true) {
		 synchronized (s) {
			
		 if(x%2==0) {
		s.set("¡÷«‡œº",27);
	}
		 else {
			s.set("¡ı“‚", 30);
		 }
		 x++;
		}
 }
	 }
}