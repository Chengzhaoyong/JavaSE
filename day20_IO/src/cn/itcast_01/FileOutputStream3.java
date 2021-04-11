package cn.itcast_01;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream3 {
		public static void main(String[] args) throws IOException {
		//	FileOutputStream fos=new FileOutputStream("fos3.txt");
			//要实现在文本中追加文字，在参数后面加true
			FileOutputStream fos=new FileOutputStream("fos3.txt",true);
			for(int i=0;i<10;i++) {
				fos.write(("hello"+i).getBytes());
				fos.write("\r\n".getBytes());
			}
			fos.close();
		}
}
