package cn.itcast_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException{
		 Socket s=new Socket("����",1234);
		 
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 //��ͨ��������װ
		 BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		 
		 String line=null;
				 while((line=br.readLine())!=null) {
					 if("88".equals(line)) {
						 break;
					 }
					 bw.write(line);
					 bw.newLine();
					 bw.flush();
					 
				 }
		 s.close();
		 br.close();
		 
		 
	}

}
