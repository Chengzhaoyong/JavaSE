package Demo07;


/*
 * ��Ա�ڲ��ࣺ
 * ���ֱ�ӷ����ڲ���ĳ�Ա
 *    �ⲿ����.�ڲ����� ������=�ⲿ�����.�ڲ������
 *   
 */

class Outer1{
	private int num = 10;

	class Inter {
		public void show() {
			System.out.println(num);
		}
	}
}
public class ChengYuanNeiBuLei {
	public static void main(String[] args) {
		// �ⲿ����.�ڲ����� ������=�ⲿ�����.�ڲ������
		Outer1.Inter oi = new Outer1().new Inter();
		oi.show();
	}
}
