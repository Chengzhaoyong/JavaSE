package cn.itcast_03;

//public class ObjectTool<T> {
//		public void show(T t) {
//			System.out.println(t);
//		}
//}

public class ObjectTool{  //可以接受任意类型
	public <T> void show(T t) {
		System.out.println(t);
	}
}