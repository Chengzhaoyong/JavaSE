package cn.itcast_02;

import java.util.Arrays;

public class Regex2 {
		public static void main(String[] args) {
			//����һ���ַ�������
			String s="32 34 54 3434 38 5 9";
			//���ַ������зָ�õ�һ���ַ�������
			String[] strArray=s.split(" ");
			//���ַ�������ת����int����
			int[] arr=new int[strArray.length];
			for(int i=0;i<arr.length;i++) {
				arr[i]=Integer.parseInt(strArray[i]);
				
			}
			//��int�����������
			Arrays.sort(arr);
			//��������������װ��һ���ַ���
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
				
			}
		}
}
