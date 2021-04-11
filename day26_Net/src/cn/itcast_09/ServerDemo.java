package cn.itcast_09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(1023);
		
		Socket s=ss.accept();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
		
				
				
		
		String line=null;
		while((line=br.readLine())!=null) {
		bw.write(line);
		bw.newLine();
		bw.flush();
		
		}

		
		BufferedWriter brserver=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		brserver.write("文本文件上传成功");
		brserver.newLine();
		brserver.flush();
		s.close();
		bw.close();
		
	}

}

