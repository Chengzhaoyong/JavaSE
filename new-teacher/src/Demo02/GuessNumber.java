package Demo02;
import java.util.Scanner;
public class GuessNumber {
  public static void main(String[] args) {
	//��������һ������������µ�
	  int number=(int)(Math.random()*100)+1;

	  while(true) {
		//��������һ����
		  Scanner sc=new Scanner(System.in);
		  System.out.println(number);
		  System.out.println("��������Ҫ�µ����֣�1-100����");
		  int guessNumber=sc.nextInt();
		
		  
		  //����λ��ᣬ���н���
		  if(guessNumber>number) {
			  System.out.println("��µ�����"+guessNumber+"����");
			  
		  }
		  else if(guessNumber<number) {
			  System.out.println("��µ�����"+guessNumber+"С��");
			  
		  }
		  else {
			  System.out.println("��ϲ��¶���");
			  break;
			  
		  }
	  }
}
}
