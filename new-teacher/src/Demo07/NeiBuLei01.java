package Demo07;
/*
 * 
 * �ڲ��������
 *     ���ඨ������������ڲ��������ͳ�Ϊ�ڲ���
 *     ����������A�ж�����һ����B����B�����ڲ���
 *     �ڲ���ķ����ص㣺
 *       A���ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽�С�
 *       B���ⲿ��Ҫ�����ڲ���ĳ�Ա���봴������
 */

class Outer{
	
	private int num=10;
	class Inter{
		public void show() {
			System.out.println(num); //A���ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽�С�
		}
	}
	public void method() {
		Inter s=new Inter();// B���ⲿ��Ҫ�����ڲ���ĳ�Ա���봴������
		s.show();
	}

}
public class NeiBuLei01 {

}
