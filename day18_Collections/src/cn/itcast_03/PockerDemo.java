package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collections;

/*
 *   模拟斗地主发牌和洗牌
 *    A：创建一个牌盒
 *    B：装牌
 *    C：洗牌
 *    D：发牌
 *    E：看牌
 */
public class PockerDemo {
		public static void main(String[] args) {

			ArrayList<String> array=new ArrayList<String>();//A：创建一个牌盒
			
			String[] colors= {"♦","♠","♥","♣"};
			String[] numbers= {"A","2","3","4","5","6","7","8","9","0","J","Q","K"};
			
		  //  B：装牌
			for(String s:colors) {
				for(String number:numbers) {
					array.add(s.concat(number));
				}
			}
       //  System.out.println(array);
			 //C：洗牌
			array.add("大王");
			array.add("小王");
			Collections.shuffle(array);
			
			
	// D：发牌
			ArrayList<String> fengqingyang=new ArrayList<String>();
			ArrayList<String> linqinxia=new ArrayList<String>();
			ArrayList<String> liuyi=new ArrayList<String>();
			ArrayList<String> dipai=new ArrayList<String>();
			
			for(int x=0;x<array.size();x++) {
				if(x>=array.size()-3) {
					dipai.add(array.get(x));
				}
				else if(x%3==0) {
					fengqingyang.add(array.get(x));
				}
				else if(x%3==1){
					linqinxia.add(array.get(x));
				}
				else {
				   liuyi.add(array.get(x));
				   
				}
				}
			
			
			
			//D:看牌
			lookPai("风清扬",fengqingyang);
			lookPai("林青霞",linqinxia);
			lookPai("刘意",liuyi);
			lookPai("底牌",dipai);
			
		}
		public static void lookPai(String name,ArrayList<String> array) {
			System.out.print(name+"的牌：");
		for(String s:array) {
			System.out.print(s+" ");
		}
		System.out.println();
		}

			}
		
