package cn.itcast_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
 *   ����¼�����ݣ���¼��0ʱ����ֹͣ¼��
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    ArrayList<Integer> array=new ArrayList<Integer>();
	    while(true) {
	    	
	    	int number=sc.nextInt();
	    	if(number!=0) {
	    		array.add(number);
	    	}
	    	else {
	    		break;
	    	}
	    }

        //������ת������
	    Integer[] i=new Integer[array.size()];
	    
	    array.toArray(i);
	    
	    Arrays.sort(i);
	    
	    System.out.println("�����ǣ�"+arrayToString(i)+"���ֵ��"+i[i.length-1]);
	   
	    
	}
	  
    public static String arrayToString(Integer[] i){
    	StringBuffer s=new StringBuffer();
    	s.append("[");
    	for(int i1=0;i1<i.length;i1++) {
    		if(i1==i.length-1) {
    			s.append(i[i1]);
    			
    		}
    		else {
    			s.append(i[i1]+",");
    		}
    	}
    	s.append("]");
    	return s.toString();
    	
    }

	
}
