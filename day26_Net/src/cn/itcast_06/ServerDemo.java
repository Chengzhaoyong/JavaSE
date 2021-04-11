package cn.itcast_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(1234);
		
		Socket s=ss.accept();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		
		//BufferedWriter bw=new BufferedWriter(new OutputStream())
		String line=null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		
		s.close();
		
	}

}

