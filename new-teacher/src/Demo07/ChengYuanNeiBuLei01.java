package Demo07;
/*
 * ��Ա�ڲ�������η���
 * private:�������ݵİ�ȫ��
 * static��Ϊ�˷����������
 * ע�⣺��̬�ڲ���ֻ�ܷ���
 * 
 * ����������һ���ˣ��������壬�����������ࣩ
 * 
 * class Body{
 *   private class Heart{//����private���Σ�����ͨ���������
 *     public void operator{
 *     System.out.println("�������");
 *     }
 *   
 *   }
 *   public void method(){
 *   if(��������ڲ�ҽ��){
 *     Heart h=new Heart();
 *     h.operator();
 *   }
 *   }
 *   
 *   }
 *   
 *   Ȼ������:   Body  b=new  Body();
 *     b.operator();
 */

class Outer2{
	private int num=10;
	//�ڲ����þ�̬����Ϊ�ڲ�����Կ������ⲿ��ĳ�Ա
	private static int num2=20;
	public static class Inter{
		public static void show() {
			//System.out.println(num);//��̬�ڲ���ֻ�ܷ����ⲿ��̬�ĳ�Ա
			System.out.println(num2);
		}
	}
}
public class ChengYuanNeiBuLei01 {
		public static void main(String[] args) {
		//	Outer.Inter oi=new Outer().new Inter();
			//oi.show();//�౻��̬���κ󣬲���ͨ���������
			
		//	��Ա�ڲ��౻��̬���κ�ķ��ʷ�ʽ��
	//      ��ʽ���ⲿ�������ڲ����� ������=new �ⲿ����.�ڲ���������
			Outer2.Inter oi=new Outer2.Inter();
			oi.show();
			//show()����һ�ֵ���
			Outer2.Inter.show();
			
		}
}
