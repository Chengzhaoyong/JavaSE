package cn.itcast_02;
/*
 *     public static void gc():垃圾回收
 *    public static void exit(int status)：终止当前运行的java虚拟机
 *    public static long currentTimeMillis()
 *    public static void arraycopy(Object src, int srcPos,Object dest, 
 *     int destPos, int length)
 */
public class SystemDemo {
		public static void main(String[] args) {
			System.out.println("林青霞（东方不败）");
		//	System.exit(0);
			System.out.println("赵雅芝（白娘子）");
			
			System.out.println(System.currentTimeMillis());
			
			//要求：统计程序运行时间
			long start=System.currentTimeMillis();
			for(int i=0;i<10000;i++) {
				System.out.println("hello"+i);
			}
			long end=System.currentTimeMillis();
			System.out.println("共耗时："+(end-start)+"毫秒");
		}
}
