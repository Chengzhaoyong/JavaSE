package cn.itcast_04;

import java.util.Arrays;

/*
 *   ����������ʶ��ʲôʱ��������ֽ�ת��Ϊһ��������
 *     �ڼ��㼰���ĵĴ洢��Ϊ�����ֽ� 
 *         ��һ���ֽڿ϶��Ǹ���
 *         �ڶ������ֳ����Ǹ���������������������ûӰ��
 */
public class StringDemo {
		public static void main(String[] args) {
//			String s="abcde";
//			//[97, 98, 99, 100, 101]
//			byte[] bys=s.getBytes();
//			System.out.println(Arrays.toString(bys));
			
			String s="�Ұ��й�";
			//[-50, -46, -80, -82, -42, -48, -71, -6]
			byte[] bys=s.getBytes();
			System.out.println(Arrays.toString(bys));
		}
}
