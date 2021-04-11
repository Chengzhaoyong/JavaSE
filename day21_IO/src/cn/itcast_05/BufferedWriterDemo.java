package cn.itcast_05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
		public static void main(String[] args) throws IOException {
			BufferedWriter bw=new BufferedWriter(new FileWriter("c.txt"));
			bw.write("hello");
			bw.write("world");
			
			bw.close();
			
		}
		
}
