package cn.itcast_05;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 *   键盘录入一个字符串，统计字母的出现个数
 *   
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s=sc.nextLine();
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		
		char[] chs=s.toCharArray();
		for(char ch:chs) {
			Integer i=tm.get(ch);
			if(i==null) {
				tm.put(ch, 1);
				
			}
			else {
				i++;
				tm.put(ch, i);
			}
		}
		
		StringBuilder sb=new StringBuilder();
		Set<Character> set=tm.keySet();
		
		for(Character ch:set) {
			sb.append(ch).append("(").append(tm.get(ch)).append(")");
		}
        System.out.println("result:"+sb);		
		
	}
}
