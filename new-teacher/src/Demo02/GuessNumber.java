package Demo02;
import java.util.Scanner;
public class GuessNumber {
  public static void main(String[] args) {
	//程序生成一个随机数，被猜的
	  int number=(int)(Math.random()*100)+1;

	  while(true) {
		//键盘输入一个数
		  Scanner sc=new Scanner(System.in);
		  System.out.println(number);
		  System.out.println("请输入你要猜的数字（1-100）：");
		  int guessNumber=sc.nextInt();
		
		  
		  //给多次机会，猜中结束
		  if(guessNumber>number) {
			  System.out.println("你猜的数据"+guessNumber+"大了");
			  
		  }
		  else if(guessNumber<number) {
			  System.out.println("你猜的数据"+guessNumber+"小了");
			  
		  }
		  else {
			  System.out.println("恭喜你猜对了");
			  break;
			  
		  }
	  }
}
}
