package cn.itcast_07;
import java.io.File;
/*
 *   ��ȡ���ܣ�
 *     Public String[] list():��ȡָ��Ŀ¼�µ������ļ��л����ļ��е���������
 *     public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ��л����ļ��е�File����
 *     
 */
public class FileDemo {
	public static void main(String[] args) {
		File file=new File("e:\\");
		String[] strArray=file.list();
		for(String s:strArray) {
			System.out.println(s);
		}
		System.out.println("============");
		File[] fileArray=file.listFiles();//��Ϊ�����ص����ļ����󣬲�ֻ�ǻ�ȡ���ƣ������Գ��ȣ��ȵ�
		for(File f:fileArray) {
			System.out.println(f.getName());
		}
	}
}
