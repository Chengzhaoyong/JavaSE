package cn.itcast_05;

import java.util.ArrayList;
import java.util.Collection;

/* 
 *    ���͸߼���ͨ�����
 *    �����������ͣ����û����ȷ����ô����Object�Լ������Java����
 *    ? extends E:�����޶���E��������
 *    �� super E:�����޶���E���丸��
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
		//	Collection<? super animal> c6=new ArrayList<Dog>();  �����
			//Collection<? super animal> c6=new ArrayList<Cat>();
			
		}
		class animal{
			
		}
		class Dog extends animal{
			
		}
		class Cat extends animal{
			
		}
}
