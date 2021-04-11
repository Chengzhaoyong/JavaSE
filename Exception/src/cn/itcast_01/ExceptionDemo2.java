package cn.itcast_01;
/*
 *   一个异常
 *   两个异常的处理：
 *      a:每一个写一个try  catch
 *      b:写一个try，多个catch
 *      
 *      
 *      JDK7出现了一个新的异常处理方案
 *      try{
 *        代码
 *      }catch(异常1 | 异常2 |){
 *        处理方案
 *      }
 *      缺点：
 *        A：处理方式一致
 *        B：多个异常间必须是平级关系
 *        
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int[] arr = new int[3];
		try {
			System.out.println(a / b);// 检测一个错误就停止程序
			System.out.println(arr[3]);

		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界");
		} catch (Exception e) {
			System.out.println("出问题了");

	   }
		System.out.println("over");
		System.out.println("-----------");
		//JDK7的处理方案
		try {
			System.out.println(a / b);// 检测一个错误就停止程序
			System.out.println(arr[3]);

		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("出现问题了");
		}
		System.out.println("over");
}
}
