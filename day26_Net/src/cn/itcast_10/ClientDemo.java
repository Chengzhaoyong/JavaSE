package cn.itcast_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
/*
 * 客户端文本文件，服务器输出控制台
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException{
		 Socket s=new Socket("永哥",1422);
		 
		 BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		 //把通道的流包装
		 BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {

			bw.write(line);
			bw.newLine();
			bw.flush();

		}
		
		
		s.shutdownOutput();
		BufferedReader brClient=new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(brClient.readLine());
		
		 s.close();
		 br.close();
		 
		 
		 
	
		
		
	}

}
