package cn.itcast_01;
/*
 *  System �����һЩ���õ����ֶκͷ����������ܱ�ʵ����
 *  
 *  ������
 *  ��Ҫ�ڳ�����Ƶ���ص����������գ���Ϊÿһ��ִ���������գ�jvm����ǿ�������������������У����ķ�
 *  �����ϵͳ��Դ�����������ĳ�������������Դ��ֻ����ִ�д����Ķ�����ͷţ��ŵ�������������
 *    public static void gc()
 *    public static void exit(int status)
 *    public static long currentTimeMillis()
 *    public static void arraycopy(Object src, int srcPos,Object dest, 
 *     int destPos, int length)
                            
                             
                           
                            
 */
public class SystemDemo {
		public static void main(String[] args) {
			Person p=new Person(60,"����֥");
			System.out.println(p);
			p=null;
			System.gc();
		}
}
