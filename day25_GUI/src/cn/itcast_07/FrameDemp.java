package cn.itcast_07;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemp {
	public static void main(String[] args) {
		//�������������������
		Frame f=new Frame("һ���˵�");
		f.setBounds(300,300,300,300);
		
		f.setLayout(new FlowLayout());
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);

		// �����˵���
		MenuBar mb = new MenuBar();
		// �����˵�
		Menu m = new Menu("�ļ�");
		// �����˵���
		MenuItem mi = new MenuItem("�˳�ϵͳ");
		m.add(mi);
		mb.add(m);
		f.setMenuBar(mb);

		mi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
}}
