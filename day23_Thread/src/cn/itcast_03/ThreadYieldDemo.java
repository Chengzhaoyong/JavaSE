package cn.itcast_03;
/*
 *   public static void yield():��ͣ����ִ�е��̶߳��󣬲�ִ�������߳�
 *   �ö���߳�ִ�и���г�����ǲ��ܱ�֤һ��һ��ִ��
 */
public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield ty1=new ThreadYield();
		ThreadYield ty2=new ThreadYield();
		
		ty1.setName("������");
		ty2.setName("˧��");
		
		ty1.start();
		ty2.start();
	}
}
