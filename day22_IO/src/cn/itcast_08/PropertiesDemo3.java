package cn.itcast_08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 *    public void load(Reader reader):把文件中数据读取到集合中
 *    public void store(Writer writer,String comments):把集合中的数据存储到文件
 *    
 */
public class PropertiesDemo3 {
	public static void main(String[] args) throws IOException {
	//	myload();
		myStore();
	}

	private static void myStore() throws IOException{
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		prop.setProperty("zhangsan", "20");
		prop.setProperty("kdkfhf", "20");
		prop.setProperty("金佛", "20");
		
		Writer w=new FileWriter("fw.txt");
		prop.store(w, "helloworld");
		w.close();
	}

	private static void myload() throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		//注意：这个文件的数据必须是键值对形式
		Reader r=new FileReader("prop.txt");
		r.close();
		prop.load(r);
	}
}
