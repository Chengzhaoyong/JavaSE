package cn.itcast.day06.demo02;

/*
 * ���ʹ�ö���õ���
 * 
 * �����һ��������������
 * 
 * 1.����
 * ͬ��������
 * 2.����
 * ������ ������=new �����ƣ�����
 * 3.ʹ��
 * ʹ�ó�Ա������������.��Ա������
 * ʹ�ó�Ա������������.��Ա��������������
 * 
 */
public class Demo01PhoneOne {
	public static void main(String[] args) {
			Phone one=new Phone();//����
			System.out.println(one.brand);
			
			System.out.println(one.price);
			System.out.println(one.color);
			System.out.println("==========");
			one.brand="ƻ��";
			one.price=8988;
			one.color="��ջ�";
			System.out.println(one.brand);
			
			System.out.println(one.price);
			System.out.println(one.color);
			one.call("�ǲ�˹");
			one.sendMessage();
			
			
		}
}
