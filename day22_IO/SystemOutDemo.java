package cn.itcast_04;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SystemOutDemo {

	public static void main(String[] args) throws IOException{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("hello");
		bw.write("world");
		bw.write("java");
		bw.flush();
	}
}
