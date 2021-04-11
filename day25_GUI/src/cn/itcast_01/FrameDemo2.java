package cn.itcast_01;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo2 {
	public static void main(String[] args) {
		


	        Frame f=new Frame("hello");
	        //方式一
	        
//			  // f.setSize(300,200);
//	        Dimension d=new Dimension(400,300);
//	        f.setSize(d);
//			  // f.setLocation(300,300);
//			   Point p=new Point(200,300);
//			   f.setLocation(p);
//			   try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			   
			   //方式二
			   f.setBounds(400,200,300,300);
//			   f.addWindowListener(new WindowListener() {
//
//				@Override
//				public void windowOpened(WindowEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//
//				@Override
//				public void windowClosing(WindowEvent e) {
//					// TODO Auto-generated method stub
//					System.exit(0);
//				}
//
//				@Override
//				public void windowClosed(WindowEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//
//				@Override
//				public void windowIconified(WindowEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//
//				@Override
//				public void windowDeiconified(WindowEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//
//				@Override
//				public void windowActivated(WindowEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//
//				@Override
//				public void windowDeactivated(WindowEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//				   
//			   });
			   
			   f.addWindowListener(new WindowAdapter() {//窗体关闭事件
			     public void windowClosing(WindowEvent e) {
			    	 System.exit(0);
			     }
			   });
			   f.setVisible(true);//此窗口不能关闭
}
	}