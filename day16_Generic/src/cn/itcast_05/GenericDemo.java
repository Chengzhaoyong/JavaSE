package cn.itcast_05;

import java.util.ArrayList;
import java.util.Collection;

/* 
 *    泛型高级（通配符）
 *    ？：任意类型，如果没有明确，那么就是Object以及任意的Java类了
 *    ? extends E:向下限定，E及其子类
 *    ？ super E:向上限定，E及其父类
 */
public class GenericDemo {
		public static void main(String[] args) {
			Collection<?> c=new ArrayList<Object>();
			Collection<?> c1=new ArrayList<animal>();
			Collection<?> c2=new ArrayList<Dog>();
			
			
			Collection<? extends animal> c3=new ArrayList<animal>();
			Collection<? extends animal> c4=new ArrayList<Dog>();
			Collection<? extends animal> c5=new ArrayList<Cat>();
			
			Collection<? super animal> c6=new ArrayList<animal>();
		//	Collection<? super animal> c6=new ArrayList<Dog>();  错误的
			//Collection<? super animal> c6=new ArrayList<Cat>();
			
		}
		class animal{
			
		}
		class Dog extends animal{
			
		}
		class Cat extends animal{
			
		}
}
