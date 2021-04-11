package cn.itcast_08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 *    有一个prop文件，数据都是键值形式的，但是不知道内容是什么
 *    请写出一个程序判断是否有“lisi”这样的键存在，如果有就改变值为100
 *    
 *    分析：
 *         A：把文件中的数据加载在到集合中来
 *         B：遍历集合，获取每一个键
 *         C；判断是否有“lesi”,如果有，就改值为100
 *         D：把集合中的数据重新存储到文件中
 */
public class PropertiesDemo4 {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		Reader r = new FileReader("prop.txt");

		prop.load(r);
		r.close();
		// 遍历集合
		Set<String> set = prop.stringPropertyNames();
		for (String key : set) {
			if ("lisi".equals(key)) {
				prop.setProperty(key, "100");
				break;
			}
		}

		// 把集合中的数据存储到文件中
		Writer w = new FileWriter("prop.txt");

		prop.store(w, null);
		w.close();

	}

}
