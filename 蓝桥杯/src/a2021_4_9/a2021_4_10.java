package a2021_4_9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class a2021_4_10 {
	public static void main(String[] args) {
		   Scanner input=new Scanner(System.in);
	        String arr=input.next();
	        Set<String> set=new HashSet<String>();
	        for(int i=0;i<arr.length();i++){
	            //��iΪ��ͷ�����п��ܽ������j�������i
	            for(int j=i+1;j<=arr.length();j++){
	            //��Ȼsubstring �±�i~j��ʱ���ǲ�����j��
	            //ÿ�����ֿ�ͷ����Ҳ�Ǹ��ǿ��Ӵ���Ҳ��������
	            //���Բ���Ҫ���substring(i,j+1)��
	            //������Ҫ���������һ���ַ�����j���ֵΪarr,length();
	                String temp=arr.substring(i,j);
	                set.add(temp);
	            }
	        }
	        System.out.println(set.size());
	    }
	

}
