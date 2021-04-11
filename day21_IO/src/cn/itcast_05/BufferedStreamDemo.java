package cn.itcast_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  字符缓冲流的特殊方法；
 *    BufferedWriter:
 *         public void newLine():根据系统来决定换行符
 *    
 *    BufferedReader:
 *        public void readLine():读一行数据
 */
public class BufferedStreamDemo {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("b,txt"));

		String s;
		while ((s = br.readLine()) != null) {
			bw.write(s);// 读一行写一行
			bw.newLine();// 换行符
			bw.flush();// 刷新缓冲区
		}
			
			br.close();
			bw.close();
			
		}
}
