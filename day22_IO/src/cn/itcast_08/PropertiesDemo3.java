package cn.itcast_08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 *    public void load(Reader reader):���ļ������ݶ�ȡ��������
 *    public void store(Writer writer,String comments):�Ѽ����е����ݴ洢���ļ�
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
		prop.setProperty("���", "20");
		
		Writer w=new FileWriter("fw.txt");
		prop.store(w, "helloworld");
		w.close();
	}

	private static void myload() throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		//ע�⣺����ļ������ݱ����Ǽ�ֵ����ʽ
		Reader r=new FileReader("prop.txt");
		r.close();
		prop.load(r);
	}
}
