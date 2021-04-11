package cn.itcast_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 *  
 */
public class FileToArrayListDemo {
		public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new FileReader("b.txt"));
			
			ArrayList<String> array=new ArrayList<String>();
			String s;
			while((s=br.readLine())!=null) {
				array.add(s);
				
			}
			br.close();
			
			//±éÀúÊý×é
			for(String s1:array) {
				System.out.println(s1);
			}
		}
}
