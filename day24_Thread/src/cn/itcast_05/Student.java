package cn.itcast_05;

public class Student {
	
	private	String name;
		private int age;
private		boolean flag;

  public synchronized void set(String name,int age) {
	  if(this.flag) {
		  try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  //设置数据
	  this.name=name;
	  this.age=age;
	  
	  //修改标记
	  this.flag=true;
	  this.notify();
	  
  }
  
  public synchronized void get() {
	  if(!this.flag) {
		  try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	  }
	  
	  System.out.println(this.name+"---"+this.age);
	  
	  //修改标记
	  this.flag=false;
	  this.notify();
	  
  }
}
