package cn.itcast_08;
import java.io.File;
/*
 *   �ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У�����ļ���
 *   ������
 *     A����װe�ж�Ŀ¼
 *     B����ȡ��Ŀ¼�������ļ������ļ��е�File����
 *     C:������File���飬�õ�ÿһ��File����Ȼ���ж�
 *     D:�Ƿ��ļ�
 *                         �ǣ������ж��Ƿ���.jpg��β
 *                         �񣺲�����
 *                  �񣺲�����
 */
public class FileDemo {
		public static void main(String[] args) {
			File file=new File("e:\\");
			
			//��ȡ��Ŀ¼�������ļ������ļ��е�File����
			File[] fileArray=file.listFiles();
			
			//������File���飬�õ�ÿһ��File����Ȼ���ж�
			for(File f:fileArray) {
				if(f.isFile()){
					if(f.getName().endsWith(".jpg")) {
						System.out.println(f.getName());
					}
				}
			}
		}
}
