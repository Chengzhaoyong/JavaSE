package msnake;

import javax.swing.JFrame;

public class MSnake extends JFrame{
  public static void main(String[] args) {
	  JFrame frame=new JFrame();
	  
	  frame.setBounds(10,10,900,700);
	 
	  frame.setResizable(false);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  frame.add(new MPanel());
	  frame.setVisible(true);//这个要在最后才行
	 
}

}
