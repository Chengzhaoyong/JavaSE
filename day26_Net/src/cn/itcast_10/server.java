package cn.itcast_10;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(1422);
		
		while(true) {
			Socket s=ss.accept();
			new Thread(new UserThread(s)).start();
		}
		
	}

}
