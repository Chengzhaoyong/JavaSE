package cn.itcast_03;
import java.io.File;
import java.io.IOException;
/*
 *   ɾ�����ܣ�
 *   public boolean delete()
 *   ע�⣺
 *   A������㴴���ļ������ļ�������д�̷�·������ô��Ĭ������Ŀ·����
 *   B��java�е�ɾ�����߻���վ
 *   C��
 */
public class FileDemo {
		public static void main(String[] args) throws IOException{
			File file=new File("e:\\a.txt");
			System.out.println("createNewFile:"+file.createNewFile());
			
			//�Ҳ�С��Ū������
			File file2=new File("a.txt");//û��·����������Ŀ��Ŀ¼�´���
			System.out.println("createNewFile:"+file2.createNewFile());
			System.out.println(file2.delete());
		}
}
