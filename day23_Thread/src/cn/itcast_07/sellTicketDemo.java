package cn.itcast_07;
/*
 *   A��ͬ����������������ʲô
 *       �������
 *   B��ͬ�������ĸ�ʽ������������
 *           ��ͬ���ؼ��ּ��ڷ�����
 *   
 *     ͬ����������˭��
 *      this
 *   
 *   C:��̬����������������
 *     ��̬������������
 *     ����ֽ����ļ�����
 *     
 */
 
public class sellTicketDemo {
		public static void main(String[] args) {
			sellTicket st=new sellTicket();
			
			Thread t1=new Thread(st,"����1");
			Thread t2=new Thread(st,"����2");
			Thread t3=new Thread(st,"����3");
			
			t1.start();
			t2.start();
			t3.start();
			
		}
}
