package cn.itcast_09;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Mypanel extends JPanel implements MouseListener,MouseMotionListener{
	int x=0;
	int y=0;
	public Mypanel() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void mousePressed(MouseEvent e) {
		x=e.getX();
		y=e.getY();
	} 
	
	public void mouseDragged(MouseEvent e)
{
	int newx=e.getX();
	int newy=e.getY();
	Graphics g=getGraphics();
	g.setColor(Color.BLUE);
	g.drawLine(x, y, newx, newy);
	
	x=newx;
	y=newy;
}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
	// void mouseReleased(MouseEvent e) {}

	
	
	}
  
	
public class MouseEventDemo extends JFrame{
		public MouseEventDemo() {
			super("Mouse Event Demo");
			Mypanel mp=new Mypanel();
			setContentPane(mp);
			
}
		
		  public static void main(String[] args) {
			MouseEventDemo m=new MouseEventDemo();
			m.setBounds(200,200,300,300);
			m.setVisible(true);
			m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
}
