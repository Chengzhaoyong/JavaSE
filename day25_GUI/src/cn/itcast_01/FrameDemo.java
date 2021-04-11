package cn.itcast_01;

import java.awt.Frame;

/*
 *    
 */
public class FrameDemo {
		//创建窗口对象
	
	   public static void main(String[] args) {
		   Frame f=new Frame("hello");
		   f.setSize(300,200);
		   f.setLocation(300,300);
		   f.setVisible(true);//此窗口不能关闭
		   
	}
	   
}
