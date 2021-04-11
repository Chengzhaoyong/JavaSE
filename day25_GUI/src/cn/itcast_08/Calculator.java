package cn.itcast_08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Calculator extends JFrame {
	private static final long serialVersionUID = 1L;
	private StringBuilder sBuilder = new StringBuilder();
	private Double a;// 中间变量用于存储输入的第一个数
	private Double b;// 中间变量，用于存储输入的第二个数
	private Double double1;// 用于接收计算结果
	 private Integer ii;// i用于表示加减乘除
	private JButton[] buttons=new JButton[30];
	private JButton[] images=new JButton[10];
	private String[] button_text= {"sin","cos","tan","lg","ln","( )","7","8","9","÷"
	,"x^y","4","5","6","×","x√y","1","2","3","-","%","0",".","=","+","常用","函数","文字","","操作"
	};

	public Calculator() {
		this.setTitle("计算管家");
		this.setSize(350, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp=this.getContentPane();
        this.setResizable(false);
		JPanel panel = new JPanel();
		JPanel panel2= new JPanel();
	
		panel.setPreferredSize(new Dimension(350, 400));// 设置网格布局那块大小
		//panel.setLayout(new BorderLayout(10, 20));
		cp.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 5,3,3));
		final TextArea label = new TextArea(10, 12);
		label.setFont(new Font("dialog", 1, 30));
		label.setBackground(Color.WHITE);
		panel2.add(label, BorderLayout.NORTH);
		panel2.setLayout(new FlowLayout());
		cp.add(panel2);
		panel.setBackground(Color.black);//设置网格背景颜色为黑色

// 定义按钮组件
//		//设置图片
		for(int i=0;i<10;i++) {
			 images[i]=new JButton(new ImageIcon("images//p"+i+"."+"png"));
			 panel.add(images[i]);
		}
	  
	   
		for(int i=0;i<30;i++) {
			buttons[i]=new JButton(button_text[i]);
			buttons[i].setFont(new Font("yahei",1,16));
			
		
			if(i<=6&&i>=22) {
				buttons[i].setForeground(Color.black);
				buttons[i].setBackground(new Color(240,240,240));
			}
			 if(i>=0&&i<=4||i>=25&&i<=29) {
				buttons[i].setForeground(Color.WHITE);
				buttons[i].setBackground(new Color(86,86,86));
			}
			 if(i==5||i==9|i==10||i==14||i==15||i==19||i==20||i==24) {
				 buttons[i].setForeground(Color.white);
				 buttons[i].setBackground(new Color(129,129,129));
			 }
			 if(i>=6&&i<=8||i>=11&&i<=13||i>=16&&i<=18||i>=21&&i<=23) {
				 buttons[i].setBackground(new Color(240,240,240));
			 }
			 if(i==23) {
				 buttons[i].setForeground(Color.red);
			 }
			// buttons[9].setFont(new Font("yahei",1,20));
			buttons[28]=new JButton(new ImageIcon("images//p10.png"));
			panel.add(buttons[i]);
			
		}
	

		
		
	   
// 给各个按钮设置动作监听器
// 输入数值操作0~9
	
   
    	buttons[6].addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				sBuilder.append(7);
				label.setText(sBuilder.toString());
			}
		});
    	buttons[7].addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				sBuilder.append(8);
				label.setText(sBuilder.toString());
			}
		});
    	buttons[8].addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				sBuilder.append(9);
				label.setText(sBuilder.toString());
			}
		});
    	buttons[11].addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				sBuilder.append(4);
				label.setText(sBuilder.toString());
			}
		});
    	buttons[12].addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				sBuilder.append(5);
				label.setText(sBuilder.toString());
			}
		});
    	buttons[13].addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				sBuilder.append(6);
				label.setText(sBuilder.toString());
			}
		});
    	buttons[16].addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				sBuilder.append(1);
				label.setText(sBuilder.toString());
			}
		});
    	buttons[17].addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				sBuilder.append(2);
				label.setText(sBuilder.toString());
			}
		});
    	buttons[18].addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				sBuilder.append(3);
				label.setText(sBuilder.toString());
			}
		});
    	buttons[21].addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				sBuilder.append(0);
				label.setText(sBuilder.toString());
			}
		});
 
  
	

//给符号加事件
		buttons[24].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(sBuilder.toString());
				sBuilder.append("+");
				label.setText(sBuilder.toString());
		       ii = 0;
			}
		});
		buttons[19].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(sBuilder.toString());
				sBuilder.append("-");
				label.setText(sBuilder.toString());
				ii = 1;
			}
		});
		buttons[14].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(sBuilder.toString());
				sBuilder.append("×");
				label.setText(sBuilder.toString());
				ii = 2;
			}
		});
		buttons[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(sBuilder.toString());
				sBuilder.append("÷");
				label.setText(sBuilder.toString());
				ii = 3;
			}
		});
		buttons[23].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
// 该判断中间变量是否为空
				if (!"".equals(sBuilder.toString()) && (!(a == 0.0))) {
					
					if (ii== 0) {
						b = Double.parseDouble(sBuilder.toString().replaceAll("\\d+\\+", ""));
						double1 = a + b;
						sBuilder.append("="+double1);
						label.setText(sBuilder.toString());
				
						sBuilder = new StringBuilder();
					} else if (ii == 1) {
						b = Double.parseDouble(sBuilder.toString().replaceAll("\\d+\\-", ""));
						double1 = a - b;
						sBuilder.append("="+double1);
						label.setText(sBuilder.toString());
						sBuilder = new StringBuilder();
				
					} else if (ii == 2) {
						b = Double.parseDouble(sBuilder.toString().replaceAll("\\d+\\×", ""));
						double1 = a * b;
						sBuilder.append("="+double1);
						label.setText(sBuilder.toString());
						sBuilder = new StringBuilder();
				
					} else if (ii == 3) {
						b = Double.parseDouble(sBuilder.toString().replaceAll("\\d+\\÷", ""));
						double1 = a / b;
						sBuilder.append("="+double1);
						label.setText(sBuilder.toString());
						sBuilder = new StringBuilder();
					} else {
						label.setText(sBuilder.toString());
					}
				}
			}
		});
		buttons[22].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sBuilder.append(".");
				label.setText(sBuilder.toString());
			}
		});
		images[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sBuilder = new StringBuilder();
				label.setText("");
			}
		});
		images[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!"".equals(sBuilder.toString())) {
					sBuilder.deleteCharAt(sBuilder.length() - 1);
					label.setText(sBuilder.toString());
				}
			}
		});

		this.setVisible(true);
	}

	public static void main(String[] args) {
		Calculator c=new Calculator();
	}
}