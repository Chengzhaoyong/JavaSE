package cn.itcast_03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 *    ��ӡ����
 *     
 */
public class PrintWriterDemo {
  public static void main(String[] args) throws FileNotFoundException {
	PrintWriter p=new PrintWriter("aa.txt");
	
	p.write("��");
   p.flush();
	
		
}
}
