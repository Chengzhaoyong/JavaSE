package cn.itcast_02;
import java.io.File;
import java.io.IOException;
/*
 *   �������ܣ�
 *     public boolean createNewFile():�����ļ�
 *     public boolean mkdir():�����ļ���
 *     public boolean mkdirs():�����ļ��У�������ļ��в����ڣ����ᴴ���������༶�ļ��д���
 *     
 *     a.txtδ�����ļ����������ļ���
 *     
 */
public class FileDemo {
		public static void main(String[] args) throws IOException{
			File file=new File("e:\\demo");
			System.out.println("mkdir:"+file.mkdir());
			
			//����e��Ŀ¼demo����һ���ļ�a.txt
			File file2=new File("e:\\demo\\a.txt");
		System.out.println("createNewFile:"+file2.createNewFile());
		//ע�⣺Ҫ����ĳ��Ŀ¼�´������ݣ���Ŀ¼�������
		
		File file3=new File("e:\\test");
		File file4=new File("e:\\test\\b.txt");
		System.out.println("mkdir:"+file3.mkdir());
		System.out.println("mkdir:"+file4.mkdir());
		//�����༶�ļ���
		File file5=new File("e:\\aa\\bb\\cc");
		System.out.println("mkdir:"+file5.mkdirs());
		
		
		}
}
