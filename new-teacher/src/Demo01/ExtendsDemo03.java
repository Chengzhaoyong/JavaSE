package Demo01;
/*
 *   �����ɣ�
 *   ��Ա���������췽������Ա����
 *   �������ֽ����˼̳У���������Ӧ�ÿ���һ�£������ɲ��ֵĸ��ԵĹ�ϵ��
 *   
 *   �̳��г�Ա�����Ĺ�ϵ��
 *    1.�����еĳ�Ա�����͸����еĳ�Ա�������Ʋ�һ�������̫��
 *   2.�����еĳ�Ա�����縸���еĳ�Ա��������һ��,����ô��
 *   �����෽���з���һ�������Ĳ���˳��
 *   a:�����෽���ľֲ���Χ�ң��о�ʹ��
 *   b:������ĳ�Ա������Χ�ң��о�ʹ��
 *   c:�ڸ���ľֲ���Χ��
 *   d:û���ҵ��ͱ���
 */


class Baba{
	public int num=10;
}

class Zizi extends Baba{
	public int num2=20;
	public int num=30;//�����еĳ�Ա�����縸���еĳ�Ա��������һ��
	public void show() {
		 int num=40;
		System.out.println(num);
		System.out.println(num2);
	}
}
public class ExtendsDemo03 {
			public static void main(String[] args) {
				Zizi s=new Zizi();
				s.show();
			}
}
