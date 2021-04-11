package cn.itcast_05;
/*
 *   JDK5的新特性
 *   自动装箱：把基本类型转换为包装类型
 *   自动拆箱；把包装类型转换为基本类型
 *   
 *   注意一个问题：在使用时，Integer x=null;代码就会出现NullPointException
 *   建议先判断是否为null，然后在使用
 *   
 *   
 *   */
public class IntegerDemo {
            public static void main(String[] args) {
            	Integer i=100;
            	i+=200;
            	System.out.println(i);
            			
            
            }
}
