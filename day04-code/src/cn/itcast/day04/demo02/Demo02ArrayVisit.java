package cn.itcast.day04.demo02;

//如果直接打印数组名称，那么到底是16进制的地址值。
//动态初始化，数组中的元素都会被赋予一个默认值。规则
//整数  0； 浮点  0.0；字符  \u0000(Unicode写法)
//布尔值  false;   字符串或其他引用类型，那么默认null；
public class Demo02ArrayVisit {
			public static void main(String[] args) {
				int[] arrayA=new int[3];
				System.out.println(arrayA[0]);
				System.out.println(arrayA[1]);
				System.out.println(arrayA[2]);
			}
}
