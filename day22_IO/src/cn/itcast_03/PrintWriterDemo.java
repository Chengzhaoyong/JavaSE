package cn.itcast_03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 *    ´òÓ¡Á÷£º
 *     
 */
public class PrintWriterDemo {
  public static void main(String[] args) throws FileNotFoundException {
	PrintWriter p=new PrintWriter("aa.txt");
	
	p.write("ºÃ");
   p.flush();
	
		
}
}
