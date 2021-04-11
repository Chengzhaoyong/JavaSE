package cn.itcast_07;
/*
 *   面试题：
 *      1：final,finally,finalize的区别
 *      2.final:最终的意思，可以修饰类，成员变量，成员方法
 *                修饰类，类不能继承
 *                修饰变量，变量是常量
 *                修饰方法，方法不能重写
 *      3.finalize:是object类的一个方法，用于来及回收
 *    
 *    2.如果catch里面有return语句，finalize里面的代码会执行吗
 *       如果会，请问在return前，还是后呢
 *       会，前
 *       准确的说，是中间
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
				 * return a在程序执行到这一步的时候，这里不是return a而是return 30
				 * 这个返回路径就形成了，但是，他发现继续执行finally的内容，a=40
				 * 再次回到以前的返回路径，继续走return 30；
				 */
			}finally {
				a=40;
			}
			return a;
		}
}
