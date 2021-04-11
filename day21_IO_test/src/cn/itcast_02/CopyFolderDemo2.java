package cn.itcast_02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * ���󣺸��ƶ༶�ļ���
 * ������
 *     A����װ����Դ
 *     B����װĿ�ĵ�
 *     C���и�File���ļ��л����ļ�
 *                                �ǣ�
 *                                      ����Ŀ�ĵ�Ŀ¼�´������ļ���
 *                                      ��ȡ��file�����µ������ļ������ļ��ж���
 *                                      �����õ�ÿһ��file����
 *                                      �ص�C
 *                                 
 *                                 �񣺾͸���
 */
 
public class CopyFolderDemo2 {
public static void main(String[] args) throws IOException {
	  File scrFolder=new File("d:\\workplace\\day21_IO_test");
	  File destFolder=new File("e:\\");
	  
	  CopyFolder(scrFolder,destFolder);//�����ļ���
}

private static void CopyFolder(File scrFolder, File destFolder) throws IOException {
	//�ж��Ƿ��ļ���
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
