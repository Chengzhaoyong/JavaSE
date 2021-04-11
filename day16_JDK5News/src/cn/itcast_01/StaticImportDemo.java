package cn.itcast_01;
/*
 *   静态导入：
 *     格式：import static 包名...类名。方法名
 *     可以直接导入方法的级别
 *     
 *     静态导入的注意事项：
 *        A：方法必须时静态的
 *        B：如果有多个同名的静态方法，容易不知道使用谁，这个时候，必须加前缀，由此可见，意义不大，所以一般不用
 */

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class StaticImportDemo {
		public static void main(String[] args) {
			//System.out.println(abs(-22));
			//System.out.println(pow(3,3));
			
			System.out.println(java.lang.Math.abs(-22));
			
		
		}
			public void abs() {
				System.out.println(100);
			}
}
