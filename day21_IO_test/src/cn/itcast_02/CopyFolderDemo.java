package cn.itcast_02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  ���󣺸��Ƶ����ļ���
 */
public class CopyFolderDemo {
			public static void main(String[] args) throws IOException {
				File scrFolder=new File("e:\\demo");
				File destFolder=new File("e:\\test");
				if(!destFolder.exists()) {
					destFolder.mkdir();//Ŀ�ĵز����ھʹ���
				}
				
				File[] arrayFile=scrFolder.listFiles();
				
				for(File file:arrayFile) {
					File newFile=new File(destFolder,file.getName().replace(".java",".haha"));
					copyFile(file,newFile);
				}
			}

			private static void copyFile(File file, File newFile) throws IOException {
				// TODO Auto-generated method stub
				FileInputStream fis=new FileInputStream(file);
				FileOutputStream fos=new FileOutputStream(newFile);
				
				int len=0;
				while((len=fis.read())!=-1) {
					fos.write(len);
				}
				fos.close();
				fis.close();
				
				
			}
			
}
