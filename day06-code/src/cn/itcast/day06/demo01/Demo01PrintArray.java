package cn.itcast.day06.demo01;

import java.util.Arrays;

public class Demo01PrintArray {
		public static void main(String[] args) {
			int[] array= {12,24,434,32,32
		};//����������̵�˼�룬ÿ������ϸ�ڶ�Ҫ���Դ���
			System.out.print("[");
			for(int i=0;i<array.length;i++) {	
				if(i==array.length-1) {
					System.out.println(array[i]+"]");
				}			
				else {
					System.out.print(array[i]+",");
	}
	}
			
			System.out.println("=============");
			//��Զ����˼�룬�ﵽͬ����Ч����
			//�Լ���������ϸ�Ĳ��裬�������˰������¡�
			//��JDK���Ѿ��������ṩ��һ�����ߣ�����Arrays��
			//ͨ��������߾Ϳ��Խ�����ת����Ϊָ����ʽ���ַ���
			System.out.println(Arrays.toString(array));
	}
		
				
			
	}

