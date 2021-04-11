package cn.itcast_08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 *    ��һ��prop�ļ������ݶ��Ǽ�ֵ��ʽ�ģ����ǲ�֪��������ʲô
 *    ��д��һ�������ж��Ƿ��С�lisi�������ļ����ڣ�����о͸ı�ֵΪ100
 *    
 *    ������
 *         A�����ļ��е����ݼ����ڵ���������
 *         B���������ϣ���ȡÿһ����
 *         C���ж��Ƿ��С�lesi��,����У��͸�ֵΪ100
 *         D���Ѽ����е��������´洢���ļ���
 */
public class PropertiesDemo4 {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		Reader r = new FileReader("prop.txt");

		prop.load(r);
		r.close();
		// ��������
		Set<String> set = prop.stringPropertyNames();
		for (String key : set) {
			if ("lisi".equals(key)) {
				prop.setProperty(key, "100");
				break;
			}
		}

		// �Ѽ����е����ݴ洢���ļ���
		Writer w = new FileWriter("prop.txt");

		prop.store(w, null);
		w.close();

	}

}
