package shiyan08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*用java做一个计算器
 * 实现整数和小数的加减乘除
 * 具有删除和复位功能
 */
public class Calculator extends JFrame {
	private static final long serialVersionUID = 1L;
	private StringBuilder sBuilder = new StringBuilder();
	private Double a;// 中间变量用于存储输入的第一个数
	private Double b;// 中间变量，用于存储输入的第二个数
	private Double double1;// 用于接收计算结果
	private Integer i;// i用于表示加减乘除

	public Calculator() {
		this.setTitle("计算器");
		this.setSize(318, 457);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(null);

// 定义一个label用于显示输入数据和计算结果，这里不用textfield，可以避免用户输入造成bug，简化程序开发
		final JLabel label = new JLabel();
		label.setBounds(0, 0, 300, 50);
	
		label.setFont(new Font("dialog", 1, 30));
		label.setOpaque(true);// 由于jlabel默认透明，直接设置背景色无效，需要先将不透明设置为true
		label.setBackground(Color.white);
		panel.add(label);

// 定义按钮组件
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button0 = new JButton("0");
		JButton buttonadd = new JButton("+");// 加
		JButton buttonminus = new JButton("-");// 减
		JButton buttontime = new JButton("×");// 乘
		JButton buttondivid = new JButton("÷");// 除
		JButton buttonequal = new JButton("=");// 等于
		JButton buttondecimal = new JButton(".");// 小数点
		JButton buttondelet = new JButton("←");// 删除
		JButton buttonclear = new JButton("C");// 清除

// 定义按钮组件位置
		button0.setBounds(0, 50, 100, 60);
		button0.setFont(new Font("dialog", 1, 30));
		panel.add(button0);
		button1.setBounds(100, 50, 100, 60);
		button1.setFont(new Font("dialog", 1, 30));
		panel.add(button1);
		button2.setBounds(200, 50, 100, 60);
		button2.setFont(new Font("dialog", 1, 30));
		panel.add(button2);
		button3.setBounds(0, 110, 100, 60);
		button3.setFont(new Font("dialog", 1, 30));
		panel.add(button3);
		button4.setBounds(100, 110, 100, 60);
		button4.setFont(new Font("dialog", 1, 30));
		panel.add(button4);
		button5.setBounds(200, 110, 100, 60);
		button5.setFont(new Font("dialog", 1, 30));
		panel.add(button5);
		button6.setBounds(0, 170, 100, 60);
		button6.setFont(new Font("dialog", 1, 30));
		panel.add(button6);
		button7.setBounds(100, 170, 100, 60);
		button7.setFont(new Font("dialog", 1, 30));
		panel.add(button7);
		button8.setBounds(200, 170, 100, 60);
		button8.setFont(new Font("dialog", 1, 30));
		panel.add(button8);
		button9.setBounds(0, 230, 100, 60);
		button9.setFont(new Font("dialog", 1, 30));
		panel.add(button9);
		buttonadd.setBounds(100, 230, 100, 60);
		buttonadd.setFont(new Font("dialog", 1, 30));
		panel.add(buttonadd);// 加
		buttonminus.setBounds(200, 230, 100, 60);
		buttonminus.setFont(new Font("dialog", 1, 30));
		panel.add(buttonminus);// 减
		buttontime.setBounds(0, 290, 100, 60);
		buttontime.setFont(new Font("dialog", 1, 30));
		panel.add(buttontime);// 乘
		buttondivid.setBounds(100, 290, 100, 60);
		buttondivid.setFont(new Font("dialog", 1, 30));
		panel.add(buttondivid);// 除
		buttonequal.setBounds(200, 290, 100, 60);
		buttonequal.setFont(new Font("dialog", 1, 30));
		panel.add(buttonequal);// 等于
		buttondecimal.setBounds(0, 350, 100, 60);
		buttondecimal.setFont(new Font("dialog", 1, 30));
		panel.add(buttondecimal);// 小数点
		buttonclear.setBounds(100, 350, 100, 60);
		buttonclear.setFont(new Font("dialog", 1, 30));
		panel.add(buttonclear);// 复位
		buttondelet.setBounds(200, 350, 100, 60);
		buttondelet.setFont(new Font("dialog", 1, 30));
		panel.add(buttondelet);// 删除

// 给各个按钮设置动作监听器
// 输入数值操作0~9
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sBuilder.append("0");
				label.setText(sBuilder.toString());
			}
		});
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sBuilder.append("1");
				label.setText(sBuilder.toString());
			}
		});
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sBuilder.append("2");
				label.setText(sBuilder.toString());
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sBuilder.append("3");
				label.setText(sBuilder.toString());
			}
		});
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sBuilder.append("4");
				label.setText(sBuilder.toString());
			}
		});
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sBuilder.append("5");
				label.setText(sBuilder.toString());
			}
		});
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sBuilder.append("6");
				label.setText(sBuilder.toString());
			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sBuilder.append("7");
				label.setText(sBuilder.toString());
			}
		});
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sBuilder.append("8");
				label.setText(sBuilder.toString());
			}
		});
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sBuilder.append("9");
				label.setText(sBuilder.toString());
			}
		});
	

// 输入运算符操作，需要先判断a是否为0.0
		buttonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(sBuilder.toString());
				
				//label.setText("+");
				sBuilder.append("+");
				label.setText(sBuilder.toString());
				//sBuilder = new StringBuilder(sBuilder = new StringBuilder());
				i = 0;
			}
		});
		buttonminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(sBuilder.toString());
				sBuilder.append("-");
				label.setText(sBuilder.toString());
				i = 1;
			}
		});
		buttontime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(sBuilder.toString());
				sBuilder.append("*");
				label.setText(sBuilder.toString());
				i = 2;
			}
		});
		buttondivid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(sBuilder.toString());
				sBuilder.append("÷");
				label.setText(sBuilder.toString());
				i = 3;
			}
		});
		buttonequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
// 该判断中间变量是否为空
				if (!"".equals(sBuilder.toString()) && (!(a == 0.0))) {
					
					if (i == 0) {
						b = Double.parseDouble(sBuilder.toString().replaceAll("\\d+\\+", ""));
						double1 = a + b;
						sBuilder.append("="+double1);
						label.setText(sBuilder.toString());
						sBuilder = new StringBuilder();
					//	sBuilder.append(double1);
					} else if (i == 1) {
						b = Double.parseDouble(sBuilder.toString().replaceAll("\\d+\\-", ""));
						double1 = a - b;
						sBuilder.append("="+double1);
						label.setText(sBuilder.toString());
						sBuilder = new StringBuilder();
						//sBuilder.append(double1);
					} else if (i == 2) {
						b = Double.parseDouble(sBuilder.toString().replaceAll("\\d+\\*", ""));
						double1 = a * b;
						sBuilder.append("="+double1);
						label.setText(sBuilder.toString());
						sBuilder = new StringBuilder();
						sBuilder.append(double1);
					} else if (i == 3) {
						b = Double.parseDouble(sBuilder.toString().replaceAll("\\d+\\÷", ""));
						double1 = a / b;
						sBuilder.append("="+double1);
						label.setText(sBuilder.toString());
						sBuilder = new StringBuilder();
						sBuilder.append(double1);
					} else {
						label.setText(sBuilder.toString());
					}
				}
			}
		});
		buttondecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sBuilder.append(".");
				label.setText(sBuilder.toString());
			}
		});
		buttonclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sBuilder = new StringBuilder();
				label.setText("");
			}
		});
		buttondelet.addActionListener(new ActionListener() {
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
		new Calculator();
	}
}