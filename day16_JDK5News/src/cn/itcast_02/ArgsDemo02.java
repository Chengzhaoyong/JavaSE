package cn.itcast_02;

import java.util.Arrays;
import java.util.List;

   /*
    *  ע������:
    *       ��Ȼ���԰�����ת�ɼ��ϣ����Ǽ��ϵĳ��Ȳ��ܸı�
    */
public class ArgsDemo02 {
	public static void main(String[] args) {
		// ����һ������
		String[] arr = { "hello", "world", "java" };
		List<String> list = Arrays.asList(arr);// ������ת�ɼ���
		// list.add("igrgrh");//UnsupportedOperationException
		// list.remove(0);//UnsupportedOperationException
		
		list.set(2,"javase");//��ɾ�����ԣ������滻���ǿ��Ե�
		for (String s : list) {
			System.out.println(s);
		}
	}
}
