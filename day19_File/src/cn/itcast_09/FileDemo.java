package cn.itcast_09;
import java.io.File;
import java.io.FilenameFilter;
/*
 *    �ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ���
 *    A:�Ȼ�ȡ���еģ�Ȼ�������ʱ�������жϣ������������
 *    B����ȡ��ʱ��������������ˣ�Ȼ���������
 *    
 *    Ҫʵ������Ч�����ͱ���ѧϰһ���ӿڣ��ļ����ƹ�����
 *    public String[] list(FilenameFilter filter):
 *    public File[] listFiles(FilenameFilter filter)
 */
public class FileDemo {
		public static void main(String[] args) {
			File file=new File("e:\\");
			
			String[] arrArray=file.list(new FilenameFilter() {
					public boolean accept(File dir,String name) {
						return new File(dir,name).isFile()&&name.endsWith(".jpg");
					}
			}
			);
			for(String s:arrArray) {
				System.out.println(s);
				
			}
		}
}
