package Demo04;
/*
 * �ӿڳ�Ա�ص㣺
 * ��Ա����:ֻ���ǳ����������Ǿ�̬��
 *    Ĭ�����η���public static final
 *    ���飺�Լ��ֶ�������
 * ���췽��:�ӿ�û�й��췽��
 * ��Ա����:ֻ���ǳ��󷽷�
 * Ĭ�����η���public abstract
 * �����Լ�����
 * 
 *   ���е��඼Ĭ�ϼ̳���һ���ࣺObject
 *   ��Object  �����εĸ��ࡣÿ���඼ʹ��Object��Ϊ����
 */
interface Inter{ 
	public int num=10;
 public final  int num2=20;
	public abstract void show();
	
}
//�ӿ���+Impl���ָ�ʽ�ǽӿڵ�ʵ�ָ�ʽ
class InterImpl implements Inter{//����̳�object,
  public  void show() {
	   
   }
}
public class InterfaceDemo01 {
		public static void main(String[] args) {
			Inter i=new InterImpl();
			System.out.println(i.num);
			System.out.println(i.num2);
			
			
			System.out.println(Inter.num);//�ɴ˿��Կ������ӿڵĳ�Ա�����Ǿ�̬������
			System.out.println(Inter.num2);//��������������
		}
}
