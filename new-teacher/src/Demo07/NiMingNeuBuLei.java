package Demo07;
/*
 * �����ڲ��ࡢ
 *  �����ڲ���ļ�д��
 * ǰ�᣺����һ������߽ӿ�
 *     �����������Ǿ�����Ҳ�����ǳ�����
 *   ��ʽ��
 *   new �������߽ӿ�������{
 *   ��д������
 *   } 
 *   ������ʲô��
 *   ��һ���̳��˸�����߸ýӿڵ�������������
 */  
interface Inter6{
	public abstract void show();
	public abstract void show2();
}

class Outer6{
	public void method() {
		//һ��������ʱ��
//		new Inter6() {
//			public void show() {
//				System.out.println("show");
//			}
//		}.show();
		//����������ʱ��
		Inter6 i=new Inter6() {
			public void show() {
				System.out.println("show");
				
			}
			public void show2() {
				System.out.println("show2");
				
			}
		};
		i.show();
		i.show2();
		
	}
}
class NiMingNeuBuLei {
public static void main(String[] args) {
	Outer6 o=new Outer6();
	o.method();
}


}
