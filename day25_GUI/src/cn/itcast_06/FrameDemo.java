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
			//�������������������
			Frame f=new Frame("�������������");
			f.setBounds(300,300,300,300);
			
			f.setLayout(new FlowLayout());
			
			f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			f.setVisible(true);
			
			//����Label��ǩ����
			  Label label=new Label("���������QQ���룬�����Ƿ����֣�����������");
			  TextField tf=new TextField(20);
			  
			  f.add(label);
			  f.add(tf);
			  
			  
			  tf.addKeyListener(new KeyAdapter() {
				  public void keyPressed(KeyEvent e) {
					  //����������־�ȡ���¼�
					  char ch=e.getKeyChar();
					  if(!(ch>='0'&&ch<='9')) {
						  e.consume();
					  }
				  }
			  });
			  
		}
}
