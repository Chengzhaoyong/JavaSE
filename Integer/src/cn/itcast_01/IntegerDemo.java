package cn.itcast_01;
/*
 *    100��ɶ����ƣ��˽��ƣ�ʮ������
 */
public class IntegerDemo {
		public static void main(String[] args) {
			System.out.println(Integer.toBinaryString(100));//������
			System.out.println(Integer.toOctalString(100));//�˽���
			System.out.println(Integer.toHexString(100));//ʮ������
			
			//pubic static final int MAX_VALUE
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
		}		}