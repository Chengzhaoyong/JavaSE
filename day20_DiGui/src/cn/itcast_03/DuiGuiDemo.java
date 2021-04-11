package cn.itcast_03;
import java.io.File;
/*
 * ����:���Ұ�D��\\workplaceĿ¼�����е�java��β���ļ��ľͶ���·���������ڿ���̨
 * 
 *     ������
 *      A����װĿ¼
 *      B����ȡ��Ŀ¼�������ļ������ļ��е�fileArray
 *      C:������File���飬�õ�ÿһ��File����
 *      D���жϸ�file�����Ƿ�Ϊ�ļ���
 *         		�ǣ��ص�B
 *                                       �񣺼����ж��Ƿ���.java��β
 *                  	�ǣ���������ļ��ľ���·��
 *                                                            �񣺲�������
 *
 */
public class DuiGuiDemo {
		public static void main(String[] args) {
			//  A����װĿ¼
			File scrFolder=new File("d:\\workplace");
			long start=System.currentTimeMillis();
			getAllJavaFilePaths(scrFolder);
			long end=System.currentTimeMillis();
			System.out.println(end-start);//�����������ʱ��
			
		}
		public static void getAllJavaFilePaths(File scrFolder) {
		//	  B����ȡ��Ŀ¼�������ļ������ļ��е�fileArray
			File[] fileArray=scrFolder.listFiles();
			//    C:������File���飬�õ�ÿһ��File����
			for(File file:fileArray) {
				if(file.isDirectory()) {  //    D���жϸ�file�����Ƿ�Ϊ�ļ���
				getAllJavaFilePaths(file);      //�ǣ��ص�B
				
				}
				else {
				if(file.getName().endsWith(".java")) { //    �񣺼����ж��Ƿ���.java��β
						System.out.println(file.getAbsolutePath());
					}
				}
			}
		}
}
