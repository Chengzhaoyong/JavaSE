package cn.itcast_05;
import java.io.File;
/*
 *   �жϹ��ܣ�
 *    public boolean isDirectory:
 *    public boolean isFile:
 *    public boolean exists:
 *    public boolean canRead:
 *    public boolean canWrite:
 *    public boolean isHidden:
 */
public class FileDemo {
		public static void main(String[] args) {
			//�����ļ�����
			File file=new File("a.txt");
			
			System.out.println("isDirextory:"+file.isDirectory());
			System.out.println("isFile:"+file.isFile());
			System.out.println("exists:"+file.exists());
			System.out.println("canRead:"+file.canRead());
			System.out.println("canWrite:"+file.canWrite());
			System.out.println("isHidden:"+file.isHidden());
		}
}
