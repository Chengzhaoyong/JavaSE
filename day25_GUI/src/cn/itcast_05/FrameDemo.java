package cn.itcast_05;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
		protected static final Color RED = null;

		public static void main(String[] args) {
			Frame f=new Frame("更改颜色");
			f.setBounds(400, 200, 300, 300);
			f.setLayout(new FlowLayout());
			
			//设置窗口关闭事件
			f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			
			Button redButton=new Button("红色");
			Button yellowButton=new Button("黄色");
			Button blueButton=new Button("蓝色");
			f.add(redButton);
			f.add(yellowButton);
			f.add(blueButton);
			
//			redButton.addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// TODO Auto-generated method stub
//					f.setBackground(Color.RED);
//				}
//				
//			});
			
			//红色按钮监听
			redButton.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					f.setBackground(Color.RED);
				}
			}		);
			
			redButton.addMouseListener(new MouseAdapter() {
				public void mouseExited(MouseEvent e) {
					f.setBackground(Color.WHITE);
				}
			}		);
			
			//黄色按钮监听
			yellowButton.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					f.setBackground(Color.yellow);
				}
			}		);
			
			yellowButton.addMouseListener(new MouseAdapter() {
				public void mouseExited(MouseEvent e) {
					f.setBackground(Color.WHITE);
				}
			}		);
			
			////蓝色按钮监听
			blueButton.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					f.setBackground(Color.blue);
				}
			}		);
			
			blueButton.addMouseListener(new MouseAdapter() {
				public void mouseExited(MouseEvent e) {
					f.setBackground(Color.WHITE);
				}
			}		);
			
			f.setVisible(true);
			
		}
}
