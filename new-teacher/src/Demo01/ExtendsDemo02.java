package Demo01;
/*
 * �̳е�ע�����
 * 1.����ֻ�ܼ̳и������з�˽�еĳ�Ա����Ա�����ͳ�Ա������
 * 2.���಻�ܼ̳и���Ĺ��췽�������ǿ���ͨ��super�����潲���ؼ���ȥ���ʸ���Ĺ��췽��
 * 3.��ҪΪ�˲��ֹ���ȥ�̳�
 * 			class A{
 *           public void show(){}
 *           public void show2(){}
 *  		class B{
 *           public void show3(){}
 *           public void show4(){}
 *           //���Ƿ���B���г��ֺ�A��һ����show2()���������ԣ����Ǿ��ü̳�������
 *           class B extends A{
 *           public void show3();
 *           } 
 *  		������ʵ�ǲ��õģ���Ϊ�������Ļ���������show2(),������show1()...
 *                           �п���show1()�����㲻��Ҫ�ġ�
 *                           
 *          ��ô������ʲôʱ���Ǽ̳���
 *          �̳���ʵ���ֵ���һ�ֹ�ϵ����is a��.
 *          Person 
 *             Student
 *             Teacher
 *             ˮ��
 *                 ƻ��
 *                 ѩ��
 *             
 *  */

class Ba{
	private int num=10;
	private int num2=20;
	private void method() {
		System.out.println(num);
		System.out.println(num2);
	}
	public void show() {
		System.out.println(num);
		System.out.println(num2);
	}
}

class Zi extends Ba{
	
}
public class ExtendsDemo02 {
	public static void main(String[] args) {
	 Zi s=new Zi();
	 s.show();
//	 s.method();
	}
}
