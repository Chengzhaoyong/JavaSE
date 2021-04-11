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
			Frame f=new Frame("����ת��");
			
		    f.setBounds(300,200,500,400);
		    TextField tf=new TextField(20);
		    Button bt=new Button("����ת��");
		    TextArea ta=new TextArea(10,40);
		    
		    f.add(tf);
		    f.add(bt);
		    f.add(ta);
		    
		    //���ô���ر�
		    f.addWindowListener(new WindowAdapter() {
              public void windowClosing(WindowEvent e) {
            	  System.exit(0);
              }
		  }  		);
		    //���ð�ť����¼�
		  bt.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  String tf_value=tf.getText().trim();
				  ta.append(tf_value+"\r\n");  //׷�����ݲ�����
				  tf.setText("");  //����ı���
				  tf.requestFocus();			//��꼯�����ı���	  
			  }
		  });
		    //������ʽ����
		    f.setLayout(new FlowLayout());
		    //��ʾ����
		    f.setVisible(true);
		
		    
		    
		
}}
