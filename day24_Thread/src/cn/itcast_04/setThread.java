package cn.itcast_04;

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
			 if(s.flag) {
				try {
					s.wait();
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				} 
			 }
		 if(x%2==0) {
		s.age=27;
		s.name="¡÷«‡œº";
	}
		 else {
			 s.age=30;
			 s.name="¡ı“‚";
		 }
		 x++;
		 s.flag=true;
		 s.notify();
}
		
		 }
}}