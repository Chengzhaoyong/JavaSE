package cn.itcast_02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * 需求：复制多级文件夹
 * 分析：
 *     A：封装数据源
 *     B：封装目的地
 *     C：判该File是文件夹还是文件
 *                                是：
 *                                      就在目的地目录下创建该文件夹
 *                                      获取该file对象下的所有文件或者文件夹对象
 *                                      遍历得到每一个file对象
 *                                      回到C
 *                                 
 *                                 否：就复制
 */
 
public class CopyFolderDemo2 {
public static void main(String[] args) throws IOException {
	  File scrFolder=new File("d:\\workplace\\day21_IO_test");
	  File destFolder=new File("e:\\");
	  
	  CopyFolder(scrFolder,destFolder);//复制文件夹
}

private static void CopyFolder(File scrFolder, File destFolder) throws IOException {
	//判断是否文件夹
	// TODO Auto-generated method stub
	if(scrFolder.isDirectory()) {
		File newFile=new File(destFolder,scrFolder.getName());
		newFile.mkdir();
		File[] arrayFile=scrFolder.listFiles();
		for(File file:arrayFile) {
	       CopyFolder(file,newFile);
		}
		
	}
	else {
		File newFile=new File(destFolder,scrFolder.getName());
		CopyFile(scrFolder,newFile);
	}
}

private static void CopyFile(File file, File newFile) throws IOException {
	// TODO Auto-generated method stub
	FileInputStream fis=new FileInputStream(file);
	FileOutputStream fos=new FileOutputStream(newFile);
	
	int len=0;
	while((len=fis.read())!=-1) {
		fos.write((char)len);
	}
	fos.close();
	fis.close();
	
	
}
}
