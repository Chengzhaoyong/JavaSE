package cn.itcast_02;
/*
 * 1.����һ���ַ���
 * 2.���ַ���ת���ַ�����
 * 3.���ַ������������
 * 4.���������ַ�����ת���ַ���
 * 5.��������ַ���
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
