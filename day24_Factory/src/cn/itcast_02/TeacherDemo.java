package cn.itcast_02;
/*
 *   ����ģʽ��
 *      ����ʽ����һ���ؾʹ�������
 *      ����ʽ���õ�ʱ�򣬲�ȥ��������
 *      
 *      �����⣺����ģʽ��˼����ʲô����д����������
 *      
 *       ����������ʽ(�ǲ��������ĵ���ģʽ)
 *       ���ԣ�����ʽ�����ܻ������ĵ���ģʽ��
 *         A�������أ��ӳټ��أ�
 *         B���̰߳�ȫ����
 *             a:�Ƿ���̻߳���   ��
 *             b���Ƿ��й�������   ��
 *             c:�Ƿ��ж�����������������   ��
 */
public class TeacherDemo {
	public static void main(String[] args) {
		Teacher t=Teacher.getTeacher();
		Teacher t1=Teacher.getTeacher();
		
		System.out.println(t==t1);
		System.out.println(t);
		System.out.println(t1);
		
	}

}
