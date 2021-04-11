package cn.itcast_02;

import java.util.Arrays;
import java.util.List;

   /*
    *  注意事项:
    *       虽然可以把数组转成集合，但是集合的长度不能改变
    */
public class ArgsDemo02 {
	public static void main(String[] args) {
		// 定义一个数组
		String[] arr = { "hello", "world", "java" };
		List<String> list = Arrays.asList(arr);// 把数组转成集合
		// list.add("igrgrh");//UnsupportedOperationException
		// list.remove(0);//UnsupportedOperationException
		
		list.set(2,"javase");//增删不可以，但是替换还是可以的
		for (String s : list) {
			System.out.println(s);
		}
	}
}
