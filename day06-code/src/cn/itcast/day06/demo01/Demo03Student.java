package cn.itcast.day06.demo01;
/* ���ʹ�ô����õĶ���
 * 
 * �൱���Ѿ��������������ɲ��֣���Ա��������Ա����
 * ���ԣ������ഴ��������Ҳ������������
 * 
 * ���ʹ�ö����еĳ�Ա��������ʽ��
 * ������.��Ա����
 * ���ʹ�ö����еĳ�Ա��������ʽ��
 * ������.��Ա������������
 * 
 */
public class Demo03Student {
		public static void main(String[] args) {
			student stu=new student();
			System.out.println(stu.name);
			System.out.println(stu.age);
			stu.name="����";
			stu.age=19;
			System.out.println(stu.name);
			System.out.println(stu.age);
			stu.eat();
			stu.sleep();
			stu.study();
		}
}
