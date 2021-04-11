package cn.itcast.day06.demo02;

/*
 * 如何使用定义好的类
 * 
 * 类就是一种引用数据类型
 * 
 * 1.导包
 * 同个包不用
 * 2.创建
 * 类名称 对象名=new 类名称（）；
 * 3.使用
 * 使用成员变量：对象名.成员变量名
 * 使用成员方法：对象名.成员方法名（参数）
 * 
 */
public class Demo01PhoneOne {
	public static void main(String[] args) {
			Phone one=new Phone();//创建
			System.out.println(one.brand);
			
			System.out.println(one.price);
			System.out.println(one.color);
			System.out.println("==========");
			one.brand="苹果";
			one.price=8988;
			one.color="深空灰";
			System.out.println(one.brand);
			
			System.out.println(one.price);
			System.out.println(one.color);
			one.call("乔布斯");
			one.sendMessage();
			
			
		}
}
