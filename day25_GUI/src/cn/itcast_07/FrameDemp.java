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
		//创建窗体对象并设置属性
		Frame f=new Frame("一级菜单");
		f.setBounds(300,300,300,300);
		
		f.setLayout(new FlowLayout());
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);

		// 创建菜单栏
		MenuBar mb = new MenuBar();
		// 创建菜单
		Menu m = new Menu("文件");
		// 创建菜单项
		MenuItem mi = new MenuItem("退出系统");
		m.add(mi);
		mb.add(m);
		f.setMenuBar(mb);

		mi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
}}
