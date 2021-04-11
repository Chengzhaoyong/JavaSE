package cn.itcast_01;
/*
 *    Collection:�Ǽ��ϵĶ���ӿڣ���������ϵ���ظ��ģ���Ψһ�ģ�������ģ�������� 
 *    
 *    Collection�Ĺ��ܸ�����
 *    
 *    1����ӹ��ܣ�
 *         boolean add(Object o):���һ��Ԫ��
 *         boolean addAll(Collection c):���һ�����ϵ�Ԫ��
 *    2��ɾ�����ܣ�
 *           void clear():�Ƴ�����Ԫ��
 *           boolean remove(Object o):�Ƴ�һ��Ԫ��
 *           boolean removeAll��Collection c�����Ƴ�һ�����ϵ�Ԫ�أ���һ���������У�
 *    3���жϹ��ܣ�
 *         boolean contains(Object o):�жϼ������Ƿ����ָ��Ԫ��
 *         boolean containsAll(Collection c):�жϼ������Ƿ����ָ������Ԫ�أ���һ���������У�
 *         boolean isEmpty()�жϼ����Ƿ� Ϊ��
 *    4����ȡ���ܣ�Iterator<E>iterator()�ص�
 *    5�����ȹ��ܣ�
 *           int size():Ԫ�صĸ���
 *           �����⣺����û��length�������ַ�����length����������û��length����������size()
 *    6:�������ܣ�
 *          boolean retainAll(Collection c):�������϶��е�Ԫ��
 *   7�� �Ѽ���ת��Ϊ���飺
 *         Object[] toArray()
 *         
 */
import java.util.*;

public class CollectionDemo2 {
		public static void main(String[] args) {

		Collection c = new ArrayList();
		// boolean add(Object o):���һ��Ԫ��
		c.add("hello");
		c.add("world");
		c.add("java");
		System.out.println("c:" + c);

		// void clear():�Ƴ�����Ԫ��
		// c.clear();
		// System.out.println("c:"+c);

		// boolean remove(Object o):�Ƴ�һ��Ԫ��
		// c.remove("hello");
		// System.out.println("c:"+c);

		// boolean contains(Object o):�жϼ������Ƿ����ָ��Ԫ��
		// System.out.println(c.contains("hello"));  true
		// System.out.println("c:"+c);		c:[hello, world, java]
 
		// boolean isEmpty()�жϼ����Ƿ� Ϊ��
		System.out.println(c.isEmpty());
		
		//  int size():Ԫ�صĸ���
		System.out.println(c.size());
	}
}
