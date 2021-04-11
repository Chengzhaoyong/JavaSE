package cn.itcast_06;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
		public static void main(String[] args) {
			//创建窗体对象并设置属性
			Frame f=new Frame("不能输入非数字");
			f.setBounds(300,300,300,300);
			
			f.setLayout(new FlowLayout());
			
			f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			f.setVisible(true);
			
			//创建Label标签对象
			  Label label=new Label("请输入你的QQ号码，不能是非数字，不信你试试");
			  TextField tf=new TextField(20);
			  
			  f.add(label);
			  f.add(tf);
			  
			  
			  tf.addKeyListener(new KeyAdapter() {
				  public void keyPressed(KeyEvent e) {
					  //如果不是数字就取消事件
					  char ch=e.getKeyChar();
					  if(!(ch>='0'&&ch<='9')) {
						  e.consume();
					  }
				  }
			  });
			  
		}
}
