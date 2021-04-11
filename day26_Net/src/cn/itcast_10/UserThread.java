package cn.itcast_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UserThread implements Runnable{
	
	Socket s;
	public UserThread(Socket s) throws IOException{
		this.s=s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

			BufferedWriter bw = new BufferedWriter(new FileWriter(System.currentTimeMillis()+".java"));

			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				bw.flush();

			}

			BufferedWriter brserver = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			brserver.write("文本文件上传成功");
			brserver.newLine();
			brserver.flush();
			s.close();
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
