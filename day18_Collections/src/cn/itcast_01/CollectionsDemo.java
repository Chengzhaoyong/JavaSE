package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *   Collections:是针对集合进行操作的工具类，都是静态方法
 *   
 *   面试题：
 *     Collection和Collections的区别：
 *       Collection是单列集合的顶层接口，有子接口List和Set
 *       Collections:是针对集合操作的工具类，有对集合进行排序和二分查找的方法
 *       
 *       
 *       要知道的方法：
 *         public static <T> void sort(List<T> list):排序  默认情况下是自然排序
 *         public static <T> int binarySearch(List<?> list,T key):二分查找
 *         public static <T> T max(Collection<?> coll):最大值
 *         public static void Reverse(List<？> list):反转
 *         public static void Shuffle(List<?> list):随机置换
 */
public class CollectionsDemo {
    public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(30);
		
		System.out.println("list:"+list);
		
		// public static <T> void sort(List<T> list):排序  默认情况下是自然排序
		//Collections.sort(list);
		
		//public static <T> int binarySearch(List<?> list,T key):二分查找
		//System.out.println(Collections.binarySearch(list, 110));-6   -最大索引加一
		//System.out.println(Collections.binarySearch(list, 30));
		
		//   public static <T> T max(Collection<?> coll):最大值
		//System.out.println(Collections.max(list));
		
		//public static void Reverse(List<？> list):反转
		//Collections.reverse(list);
		
		
		//public static void Shuffle(List<?> list):随机置换
		Collections.shuffle(list);
		
		System.out.println("list:"+list);
		
	}
}
