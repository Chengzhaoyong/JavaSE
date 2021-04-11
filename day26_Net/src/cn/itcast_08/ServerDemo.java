package cn.itcast_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException{
		ServerSocket ss=new ServerSocket(5432);
		
		Socket s=ss.accept();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line=null;
		while((line=br.readLine())!=null) {
		System.out.println(line);
		}
		
		s.close();
		
	}

}

