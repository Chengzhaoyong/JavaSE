package msnake;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MPanel extends JPanel implements KeyListener, ActionListener{
	ImageIcon tittle=new ImageIcon("tittle.jpg");
	ImageIcon up=new ImageIcon("up.png");
	ImageIcon down=new ImageIcon("down.png");
	ImageIcon left=new ImageIcon("left.png");
	ImageIcon right=new ImageIcon("right.png");
	ImageIcon body=new ImageIcon("body.png");
	ImageIcon food=new ImageIcon("food.png");
	 
	int len=3;
	int score=0;
	int[] snakex=new int[750];   
	int[] snakey=new int[750];
	
	String fx="R";//��ͷ����  
	boolean isStart=false;  //�ж���Ϸ�Ƿ�ʼ
	
	
	Timer time=new Timer(200,this);
	
	boolean isFail=false;  //�ж�ͷ���Ƿ���������
	
	//ʳ����������
	int foodx;
	int foody;
	Random r=new Random();
	
	
	public MPanel() {
		initSnake();
		this.setFocusable(true);     //��ȡ����
		this.addKeyListener(this);
		time.start();
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
       this.setBackground(Color.WHITE);
       
       tittle.paintIcon(this,g,25,11);
       
       g.fillRect(25,75,850,600);
       
       if(fx=="R") {
       right.paintIcon(this, g, snakex[0], snakey[0]);
       }else if(fx=="L") {
    	   left.paintIcon(this, g, snakex[0], snakey[0]);
       }
       else if(fx=="U") {
    	   up.paintIcon(this, g, snakex[0], snakey[0]);
       }
       else if(fx=="D"){
    	   down.paintIcon(this, g, snakex[0], snakey[0]);
       }
      
       
       for(int i=1;i<len;i++) {
    	   body.paintIcon(this, g, snakex[i], snakey[i]);
       }
       
      //ʳ�������
       food.paintIcon(this, g, foodx, foody);
       
       //��ʼǰ
       if(isStart==false) {
       g.setColor(Color.white);
       g.setFont(new Font("arial",Font.BOLD,40));
       g.drawString("Press Space to Start",300,300);
       
       }
       
       //�������ߵĳ�����ʾ
       g.setColor(Color.white);
       g.setFont(new Font("arial",Font.BOLD,20));
       g.drawString("len:"+len,750,35);
       g.drawString("score:"+score, 750, 50);
       
        //�����ͷ��������
       if(isFail==true) {
           g.setColor(Color.RED);
           g.setFont(new Font("arial",Font.BOLD,40));
           g.drawString("Failed:Press Space to Start",200,300);
           }
       
	}
	
	
	public void initSnake() {
		len=3;
		snakex[0]=100;  //��ͷ
		snakey[0]=100;
		snakex[1]=75;   //����
		snakey[1]=100;
		snakex[2]=50;
		snakey[2]=100;
		foodx=25+25*r.nextInt(33);
		foody=75+25*r.nextInt(24);
		fx="R";
		score=0;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int keyCode=e.getKeyCode();
		if(keyCode==KeyEvent.VK_SPACE) {
			if(isFail) {
				isFail=false;
				initSnake();
			}
			else {
			isStart=!isStart;       //���������Ƕ�ΰ��ո��ת����ʼ���
            } 
			repaint();
		
		}
		else if(keyCode==KeyEvent.VK_LEFT) {
			fx="L";
		}
		else if(keyCode==KeyEvent.VK_RIGHT) {
			fx="R";
		}
		else if(keyCode==KeyEvent.VK_UP) {
			fx="U";
		}
		else if(keyCode==KeyEvent.VK_DOWN) {
			fx="D";
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(isStart&&!isFail) {           //������������ͨ�����ո��������ͣ
	  for(int i=len-1;i>0;i--) {
		  snakex[i]=snakex[i-1];
		  snakey[i]=snakey[i-1];
	  }
	  if(fx=="R") {
	  snakex[0]=snakex[0]+25;
	  if(snakex[0]>850) 
		  snakex[0]=25;
	  }
	  else if(fx=="L") {
		  snakex[0]=snakex[0]-25;
		  if(snakex[0]<25)
			  snakex[0]=850;
	  }
	  else if(fx=="U") {
		  snakey[0]=snakey[0]-25;
		  if(snakey[0]<75)
			  snakey[0]=650;
	  }
	  else if(fx=="D") {
		  snakey[0]=snakey[0]+25;
		  if(snakey[0]>650)
			  snakey[0]=75;
	  }
	  if(foodx==snakex[0]&&foody==snakey[0]) {
		  len++;
		  score+=10;
		  foodx=25+25*r.nextInt(30);
		  foody=75+25*r.nextInt(24);
	  }
	  
	 for(int i=1;i<len;i++) {
		 if(snakex[i]==snakex[0]&&snakey[i]==snakey[0]) {
			 isFail=true;
		 }
	 }
		repaint();       //�ػ����
		
   }
		time.start();
	}

}
