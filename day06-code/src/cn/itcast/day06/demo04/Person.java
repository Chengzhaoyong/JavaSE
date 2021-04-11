package cn.itcast.day06.demo04;
/*
 * 构造方法就是专门用来创建对象的方法，当通过new关键字创建对象的时候，其实就是在调用构造方法。
 * 
 * 如何定义一个构造方法，格式：
 *   public 构造方法名（参数类型 参数名称）{
 *    方法体；
 *    return;通常最后一行return不写
 *    
 *   } 
 *   注意：
 *   1.构造方法不能写返回值类型，连void都不能写。
 *   2.构造方法的名称必须和所在的类名称完全一样，连大小写都一样。
 *   
 */
public class Person {
	public Person() {
		System.out.println("构造方法执行");
	}

}
