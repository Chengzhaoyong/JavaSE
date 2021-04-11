package cn.itcast_01;
/*
 *   异常：程序出现了不正常的情况
 *   
 *   程序的异常：Throwable
 *     严重的问题：Error  我们不处理，这种问题一般是很严重，比如说内存溢出
 *     问题：Exception
 *        编译问题：不是RuntimeException的异常必须进行处理，因为你不处理，编译不能通过
 *        运行问题:RuntimeException这种问题我们也不处理，因为是你的问题，而且这个问题出现肯
 *        定是我们的代码不够严谨，需要修正代码的
 *       
 *    如何程序出现问题，我们没有做任何处理最终jvm会做出默认的处理
 *    把异常的名字，原因及出现的问题等信息输出在控制台
 *    
 *    我们如何处理异常
 *    A：try   catch   finally
 *    B:throws  抛出
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
					System.out.println("除数不能为0");
				}
				
			}
}
