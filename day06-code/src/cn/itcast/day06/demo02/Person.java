package cn.itcast.day06.demo02;
/*
 * ����Personʱ��age��Ӧ��Ϊ����
 * 
 * �������:ʹ��private�ؼ���
 * ��������Χ�⣬�Ͳ��ܷ�����
 * ��ӷ���
 */
public class Person {
		//��Ա����
		String name;
		private int age;
		//��Ա����
		public void show() {
			System.out.println("�ҽ�"+name+",����"+age+"�ꡣ");
		}
		public void setAge(int sum) {
			if(sum<0) {
				System.out.println("���ݴ���");
			}
			else {
			age=sum;
		}
			}
		public int getAge() {
			return age;
		}
}
