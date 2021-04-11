package cn.itcast_07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *   
 */
public class BufferedInputStreamDemo {
			public static void main(String[] args) throws IOException {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("e:\\moive\\¡˜¿À1.mp4"));
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("e:\\haha.mp4"));
//				int by=0;
//				while((by=bis.read())!=-1) {
//					System.out.println((char)by);
//				}
			
			long start=	System.currentTimeMillis();
				byte[] bys=new byte[1024];
				int len=0;
				while((len=bis.read(bys))!=-1) {
					bos.write(bys,0,len);
				}
			long end=System.currentTimeMillis();
			System.out.println((end-start)+"∫¡√Î");
				bis.close();
				bos.close();
			}
}
