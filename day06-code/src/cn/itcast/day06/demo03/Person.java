package cn.itcast.day06.demo03;
/*
 * ���ֲ������ͳ�Ա����������ʱ�򣬷����ػ���ݡ��ͽ�ԭ��ʹ�þֲ�������
 * ���ϣ������һ�£�����Ҫʹ�ø�ʽ��
 * this.��Ա������
 * 
 * this�ؼ��ֵľ������ã��������ĳ�Ա�����;ֲ��������ֿ�
 * 
 * ͨ��˭���õķ�����˭����this
 * 
 */
public class Person {
	String name;
	public void sayHello(String name) {
		System.out.println(name+",��á�����"+this.name+"��");
	}
}
