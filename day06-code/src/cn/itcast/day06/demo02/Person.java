package cn.itcast.day06.demo02;
/*
 * 定义Person时候，age不应该为负数
 * 
 * 解决方案:使用private关键字
 * 超出本范围外，就不能访问了
 * 间接访问
 */
public class Person {
		//成员变量
		String name;
		private int age;
		//成员方法
		public void show() {
			System.out.println("我叫"+name+",今年"+age+"岁。");
		}
		public void setAge(int sum) {
			if(sum<0) {
				System.out.println("数据错误");
			}
			else {
			age=sum;
		}
			}
		public int getAge() {
			return age;
		}
}
