package cn.itcast.day06.demo01;
/*
 * 定义一个类，用来模拟现实事物”学生“
 * 
 * 学生有两个组成部分；
 * 属性：姓名，年龄；
 * 行为：吃饭，睡觉，学习
 * 
 * 对应类当中也是两个组成部分
 * 成员变量（属性）：
 * 		String name;
 * 		int age;
 * 成员方法（行为）
 * 		public void eat(){....}
 * 		public void sleep(){...}
 * 		public void study(){...}
 * 
 */
public class student {
	//成员变量
		int age;
		String name;
		//成员方法
		public void eat() {	
			System.out.println("吃饭饭");
		}
		public void sleep() {
			System.out.println("睡觉");
			}
		public void study() {
			System.out.println("学习");
			}
		
		
}
