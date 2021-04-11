package cn.itcast_01;
/*
 *  System 类包含一些有用的类字段和方法。它不能被实例化
 *  
 *  方法：
 *  不要在程序中频繁地调用垃圾回收，因为每一次执行垃圾回收，jvm都会强制启动垃圾回收器运行，这会耗费
 *  更多的系统资源，会与正常的程序运行争抢资源，只有在执行大量的对象的释放，才调用垃圾回收器
 *    public static void gc()
 *    public static void exit(int status)
 *    public static long currentTimeMillis()
 *    public static void arraycopy(Object src, int srcPos,Object dest, 
 *     int destPos, int length)
                            
                             
                           
                            
 */
public class SystemDemo {
		public static void main(String[] args) {
			Person p=new Person(60,"赵雅芝");
			System.out.println(p);
			p=null;
			System.gc();
		}
}
