package cn.itcast_03;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*  ���󣺰Ѱ�ť��ӵ����壬���԰�ť���һ������¼�
 *      A:�����������
 *      B:������ť����
 *      C:�Ѱ�ť��ӵ�����
 *      D:������ʾ
 */
public class FrameDemo {
		public static void main(String[] args) {
			Frame f=new Frame("��Ӱ�ť"); //�����������
			
			f.setBounds(200,300,300,200);//���ô����С
			
			Button b=new Button("��ť");//���ð�ť
			b.setSize(10,20);
			
			f.add(b);  //�Ѱ�ť��ӵ�����
			
			f.addWindowListener(new WindowAdapter() {  //�رմ���
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			
			f.setVisible(true);   //������ʾ
		}
}
