package cn.itcast_01;
import java.io.File;

/*
 * ����Ҫʵ��IO�Ĳ�������Ҫ֪��Ӳ�����ļ��ı�����ʽ
 *  ��java���ṩ���ṩ��File������ʹ��
 *  
 *   File���ļ���Ŀ¼���ļ��У�·�����ĳ����ʾ��ʽ
 *   ���췽����
 *     File:(String pathname):����һ��·���õ�File����
 *     File��String parent��String child��������һ��Ŀ¼��һ�����ļ��еõ�File����
 *     File��File patent��String child��������һ��File�����һ�����ļ�/Ŀ¼�õ�File����
 */
public class FileDemo {
	public static void main(String[] args) {
		// File:(String pathname):����һ��·���õ�File����
		File file=new File("E:\\demo\\a.txt");
		
		// File��String parent��String child��������һ��Ŀ¼��һ�����ļ��еõ�File����
		File file1=new File("E:\\demo","a.txt");
		
		// File��File patent��String child��������һ��File�����һ�����ļ�/Ŀ¼�õ�File����
		File file3=new File("E:\\demo");
		File file4=new File(file3,"a.txt");
		
	}
}
