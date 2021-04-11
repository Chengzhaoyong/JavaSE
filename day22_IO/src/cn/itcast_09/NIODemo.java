package cn.itcast_09;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 *     nio在JDK4出现，提供了IO流的操作效率，但是目前还不是大范围的使用
 *     
 *     
 *     Jdk7之后的nio:
 *     Path:路径
 *     Paths:有一个静态方法返回一个路径
 *            public static path get(URI uri):
 *     files:提供了静态方法供我们使用
 *           public static long copy(Path source,Outputstream out):复制文件
 *                                    数据源                            目的地
 *           public static Path write(Path path,Iterable<? extends CharSequence> lines,Charset )
 *           							目的地
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
