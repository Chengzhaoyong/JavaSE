package cn.itcast_09;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 *     nio��JDK4���֣��ṩ��IO���Ĳ���Ч�ʣ�����Ŀǰ�����Ǵ�Χ��ʹ��
 *     
 *     
 *     Jdk7֮���nio:
 *     Path:·��
 *     Paths:��һ����̬��������һ��·��
 *            public static path get(URI uri):
 *     files:�ṩ�˾�̬����������ʹ��
 *           public static long copy(Path source,Outputstream out):�����ļ�
 *                                    ����Դ                            Ŀ�ĵ�
 *           public static Path write(Path path,Iterable<? extends CharSequence> lines,Charset )
 *           							Ŀ�ĵ�
 */
public class NIODemo {
			public static void main(String[] args) throws IOException{
			//	Files.copy(Paths.get("SystemIndemo.java"), new FileOutputStream("copy3.txt"));
				
				ArrayList<String> array=new ArrayList<String>();
				
				array.add("hello");
				array.add("world");
				array.add("java");
				
				Files.write(Paths.get("array.txt"),array,Charset.forName("GBK"));
				
			}
}
