package cn.itcast_01;
/*
 *   �쳣����������˲����������
 *   
 *   ������쳣��Throwable
 *     ���ص����⣺Error  ���ǲ�������������һ���Ǻ����أ�����˵�ڴ����
 *     ���⣺Exception
 *        �������⣺����RuntimeException���쳣������д�����Ϊ�㲻�������벻��ͨ��
 *        ��������:RuntimeException������������Ҳ��������Ϊ��������⣬�������������ֿ�
 *        �������ǵĴ��벻���Ͻ�����Ҫ���������
 *       
 *    ��γ���������⣬����û�����κδ�������jvm������Ĭ�ϵĴ���
 *    ���쳣�����֣�ԭ�򼰳��ֵ��������Ϣ����ڿ���̨
 *    
 *    ������δ����쳣
 *    A��try   catch   finally
 *    B:throws  �׳�
 *    
 *        
 */
public class ExceptionDemo {
			public static void main(String[] args) {
				int a=10;
				int b=0;
				try {
					System.out.println(a/b);
				}
				catch(ArithmeticException e) {
					System.out.println("��������Ϊ0");
				}
				
			}
}
