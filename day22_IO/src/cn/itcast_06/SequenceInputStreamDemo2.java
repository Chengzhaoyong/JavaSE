package cn.itcast_06;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;


/*
 *    a.txt+b.txt+c.txt-----d.txt
 */
public class SequenceInputStreamDemo2 {
		public static void main(String[] args) throws IOException {
			//���󣺰�����������ļ������ݸ��Ƶ�copy2.java��
			//SequenceInputStream(Enumeration e)
			//ͨ���򵥻ع�����֪����Enumeration��Vector�е�һ�������ķ���ֵ����
			//Enumeration<E> elements()
			
			Vector<InputStream> v=new Vector<InputStream>();
			InputStream s1=new FileInputStream("SystemInDemo.java");
			InputStream s2=new FileInputStream("SystemOutDemo.java");
			InputStream s3=new FileInputStream("SequenceInputStreamDemo.java");
			
			v.add(s1);
			v.add(s2);
			v.add(s3);
			Enumeration<InputStream> en=v.elements();
			
			
			SequenceInputStream sis=new SequenceInputStream(en);
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copy2.txt"));
			
			byte[] bys=new byte[1024];
			int len=0;
			while((len=sis.read(bys))!=-1) {
				bos.write(bys,0,len);
			}
			sis.close();
			bos.close();
		}
}
