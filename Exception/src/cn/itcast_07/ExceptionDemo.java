package cn.itcast_07;
/*
 *   �����⣺
 *      1��final,finally,finalize������
 *      2.final:���յ���˼�����������࣬��Ա��������Ա����
 *                �����࣬�಻�ܼ̳�
 *                ���α����������ǳ���
 *                ���η���������������д
 *      3.finalize:��object���һ��������������������
 *    
 *    2.���catch������return��䣬finalize����Ĵ����ִ����
 *       ����ᣬ������returnǰ�����Ǻ���
 *       �ᣬǰ
 *       ׼ȷ��˵�����м�
 */
public class ExceptionDemo {
		public static void main(String[] args) {
			System.out.println(getInt());
			
		}
		public static int getInt() {
			int a=10;
			try {
				System.out.println(a/0);
				a=20;
			}
			catch(ArithmeticException e) {
				a=30;
				return a;
				/*
				 * return a�ڳ���ִ�е���һ����ʱ�����ﲻ��return a����return 30
				 * �������·�����γ��ˣ����ǣ������ּ���ִ��finally�����ݣ�a=40
				 * �ٴλص���ǰ�ķ���·����������return 30��
				 */
			}finally {
				a=40;
			}
			return a;
		}
}
