package cn.itcast_04;
import java.io.File;
/*
 *   ���������ܣ�
 *   public boolean renameTo(File dest)
 *   ���·������ͬ������
 *   ��ͬ���Ǹ���������
 *   
 *   ·�����̷���ʼ������·��   c:\\a.txt
 * ·�������̷���ʼ�����·��  a.txt
 */
public class FileDemo {
	public static void main(String[] args) {
//		File file=new File("1.jpg");
//		File newfile=new File("2.jpg");
//		System.out.println(file.renameTo(newfile));
		
		
		//���·������ͬ,������  ��ͬ���Ǹ���������
		File file2=new File("2.jpg");
		File file3=new File("1.jpg");
		System.out.println("renameTo:"+file2.renameTo(file3));
	}
}
