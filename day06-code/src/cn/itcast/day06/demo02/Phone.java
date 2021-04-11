package cn.itcast.day06.demo02;
/*
 * 定义一个类，用来模拟手机事物
 * 
 * 手机事物有两个组成部分：
 * 属性：品牌，价格，颜色
 * 行为：打电话，发信息
 * 
 * 成员变量：String brand;
 *     double price;
 *     String color;
 * 成员方法：public void call(String who){...}//打电话
 * 			public void sendMessage(){...}//发信息
 * 
 */
public class Phone {
	//成员变量
			String brand;
			double price;
			String color;
			//成员方法
			public void call(String who) {
				System.out.println("给"+who+"发信息");
			
		}	
			public void sendMessage(){
				System.out.println("群发信息");
			}
			
}
