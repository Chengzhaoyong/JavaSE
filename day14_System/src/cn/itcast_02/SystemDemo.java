package cn.itcast_02;
/*
 *     public static void gc():��������
 *    public static void exit(int status)����ֹ��ǰ���е�java�����
 *    public static long currentTimeMillis()
 *    public static void arraycopy(Object src, int srcPos,Object dest, 
 *     int destPos, int length)
 */
public class SystemDemo {
		public static void main(String[] args) {
			System.out.println("����ϼ���������ܣ�");
		//	System.exit(0);
			System.out.println("����֥�������ӣ�");
			
			System.out.println(System.currentTimeMillis());
			
			//Ҫ��ͳ�Ƴ�������ʱ��
			long start=System.currentTimeMillis();
			for(int i=0;i<10000;i++) {
				System.out.println("hello"+i);
			}
			long end=System.currentTimeMillis();
			System.out.println("����ʱ��"+(end-start)+"����");
		}
}
