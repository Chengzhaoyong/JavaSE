package cn.itcast_02;
/*
 * 1.定义一个字符串
 * 2.把字符串转换字符数组
 * 3.把字符数组进行排序
 * 4.把排序后的字符数组转成字符串
 * 5.输出最后的字符串
 * 
 */
public class ArrayTest {
			public static void main(String[] args) {
				String s="jlienbo";
				char[] chs=s.toCharArray();
				bubbleSort(chs);
				
				String result=String.valueOf(chs);
				System.out.println(result);
				
			}
			public static void bubbleSort(char[] chs) {
				for(int x=0;x<chs.length-1;x++) {
					for(int y=0;y<chs.length-1-x;y++) {
						if(chs[y]>chs[y+1]) {
							char temp=chs[y];
							chs[y]=chs[y+1];
							chs[y+1]=temp;
							
					}
					}
				}
			}
			
}
