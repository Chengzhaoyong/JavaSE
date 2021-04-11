package cn.itcast_04;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class FrameDemo {
		public static void main(String[] args) {
			Frame f=new Frame("数据转移");
			
		    f.setBounds(300,200,500,400);
		    TextField tf=new TextField(20);
		    Button bt=new Button("数据转移");
		    TextArea ta=new TextArea(10,40);
		    
		    f.add(tf);
		    f.add(bt);
		    f.add(ta);
		    
		    //设置窗体关闭
		    f.addWindowListener(new WindowAdapter() {
              public void windowClosing(WindowEvent e) {
            	  System.exit(0);
              }
		  }  		);
		    //设置按钮点击事件
		  bt.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  String tf_value=tf.getText().trim();
				  ta.append(tf_value+"\r\n");  //追加内容并换行
				  tf.setText("");  //清空文本框
				  tf.requestFocus();			//鼠标集中在文本框	  
			  }
		  });
		    //设置流式布局
		    f.setLayout(new FlowLayout());
		    //显示窗体
		    f.setVisible(true);
		
		    
		    
		
}}
