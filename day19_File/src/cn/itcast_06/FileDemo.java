package cn.itcast_06;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 *   ��ȡ���ܣ�
 *     public String getAbsolutePath():��ȡ����·��
 *     public String getPath():��ȡ���·��
 *     public String getName():��ȡ����
 *     public long length():��ȡ���ȣ��ֽ���
 *     public long lastModified():��ȡ���һ���޸�ʱ�䣬�Ǻ���ֵ
 */
public class FileDemo {
	public static void main(String[] args) {
		File file=new File("demo\\test.txt");
		
		System.out.println("getAbsolutePath:"+file.getAbsolutePath());
		System.out.println("getPath:"+file.getPath());
		System.out.println("getName:"+file.getName());
		System.out.println("length:"+file.length());
		System.out.println("lastModified:"+file.lastModified());
		
		Date d=new Date(file.lastModified());
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s1=s.format(d);
		System.out.println(s1);
		
	}
}
