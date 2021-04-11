package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
 *   思路：
 *      A：创建一个HashMap集合
 *      B：创建一个ArrayList集合
 *      C：创建花色和点数数组
 *      D：从0开始往HashMap里面编号，并存储对应的牌，同时往ArrayList里面存储编号即可
 *      E：洗牌（洗的是编号）
 *      F：看牌
 */
public class PokerDemo {
		public static void main(String[] args) {
			HashMap<Integer,String> hm=new HashMap<Integer,String>();
			ArrayList<Integer> array=new ArrayList<Integer>();
			
			String[] numbers= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
			String[] colors= {"♦","♣","♥","♠"};
			
			
			int index=0;
			for(String number:numbers) {
				for(String color:colors) {
				hm.put(index, color.concat(number));
				array.add(index);
				index++;
				
				}
			}
			hm.put(index,"小王");
			array.add(index);
			index++;
			hm.put(index,"大王");
			array.add(index);
			
			Collections.shuffle(array);
		//	System.out.println(array);
			TreeSet<Integer> fengqingyang=new TreeSet<Integer>();
			TreeSet<Integer> linqinxia=new TreeSet<Integer>();
			TreeSet<Integer> liuyi=new TreeSet<Integer>();
			TreeSet<Integer> dipai=new TreeSet<Integer>();
			
			for(int x=0;x<array.size();x++) {
				if(x>=array.size()-3) {
					dipai.add(array.get(x));
				}
				else if(x%3==0) {
					fengqingyang.add(array.get(x));
				}
				else if(x%3==1) {
					linqinxia.add(array.get(x));
				}
				else if(x%3==2){
					liuyi.add(array.get(x));
				}
			}
			
			
			lookPai("风清扬",fengqingyang,hm);
			lookPai("林青霞",linqinxia,hm);
			lookPai("刘意",liuyi,hm);
			lookPai("底牌",dipai,hm);
			
		}
		
		
	
		
   public static void lookPai(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm) {
	System.out.print(name+"的牌是：");
	for(Integer i:ts) {
		String value=hm.get(i);
		System.out.print(value+" ");
		
	}
	System.out.println();
}
   }
