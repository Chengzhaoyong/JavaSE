package cn.itcast_03;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*  需求：把按钮添加到窗体，并对按钮添加一个点击事件
 *      A:创建窗体对象
 *      B:创建按钮对象
 *      C:把按钮添加到窗体
 *      D:窗体显示
 */
public class FrameDemo {
		public static void main(String[] args) {
			Frame f=new Frame("添加按钮"); //创建窗体对象
			
			f.setBounds(200,300,300,200);//设置窗体大小
			
			Button b=new Button("按钮");//设置按钮
			b.setSize(10,20);
			
			f.add(b);  //把按钮添加到窗体
			
			f.addWindowListener(new WindowAdapter() {  //关闭窗体
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			
			f.setVisible(true);   //窗体显示
		}
}
