package cn.itcast_01;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream3 {
		public static void main(String[] args) throws IOException {
		//	FileOutputStream fos=new FileOutputStream("fos3.txt");
			//Ҫʵ�����ı���׷�����֣��ڲ��������true
			FileOutputStream fos=new FileOutputStream("fos3.txt",true);
			for(int i=0;i<10;i++) {
				fos.write(("hello"+i).getBytes());
				fos.write("\r\n".getBytes());
			}
			fos.close();
		}
}
