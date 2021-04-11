package cn.itcast_08;
/*
 *    请用LinkedList模拟栈数据结构的集合，并测试
 */
public class MyStackDemo {
		public static void main(String[] args) {
			MyStack m=new MyStack();
			m.add("hello");
			m.add("world");
			m.add("java");
			/*
			System.out.println(m.get());
			System.out.println(m.get());
			System.out.println(m.get());
			System.out.println(m.get());*/
			
			
			while(!m.isEmpty()) {
				System.out.println(m.get());
			}
		}
}
