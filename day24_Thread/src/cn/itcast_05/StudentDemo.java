package cn.itcast_05;
/*
 *    ��������һ�ε����
 *      �ù�Java�ṩ�Ļ��ѵȴ�����
 *       
 *       �ȴ����ѣ�
 *        Object�����ṩ������������
 *            wait():�ȴ�
 *            notify():���ѵ����߳�
 *            notifyAll():���������߳�
 *         Ϊʲô��Щ����������Thread���е�
 *          ��Щ�����ĵ��ñ���ͨ����������ã������Ǹղ�ʹ�õ�������������������
 *          ���ԣ���Щ�������붨����Object����
 */
public class StudentDemo {
		public static void main(String[] args) {
			Student s=new Student();
			
			setThread st=new setThread(s);
			getThread gt=new getThread(s);
			
			Thread s1=new Thread(st);
			Thread s2=new Thread(gt);
			
			s1.start();
			s2.start();
		}
}
