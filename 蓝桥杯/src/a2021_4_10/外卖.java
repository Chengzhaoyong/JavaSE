package a2021_4_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ���� {
	public static void main(String[] args) {
		  Scanner input=new Scanner(System.in);
	        int N=input.nextInt();
	        int M=input.nextInt();
	        int T=input.nextInt();
	        List arr[]=new ArrayList[T+1];
	        int better[]=new int[N+1];
	        boolean  level[]=new boolean[N+1];
	        for(int i=0;i<=T;i++){
	            arr[i]=new ArrayList();
	        }
	        for(int i=1;i<=M;i++){
	            int ts=input.nextInt();
	            int id=input.nextInt();
	            arr[ts].add(id);    //tʱ���е���id�Ķ�����
	        }
	        for(int i=1;i<=T;i++){
	            for(int j=1;j<=N;j++){
	                int flag=0;
	                Object k=j;
	                while (arr[i].contains(k)){
	                    flag=1;
	                    
	                    better[j]+=2;
	                    arr[i].remove(k);
	                    if(better[j]>5)
	                        level[j]=true;
	                }
	                if(flag==0) {    //��ʱ���޵���j�Ķ���
	                    better[j] = better[j] == 0 ? 0 : better[j] - 1;
	                    if (level[j]) {    //ԭ���ڻ������
	                        if (better[j] <= 3) {    //���ȼ��½�
	                            level[j] = false;

	                        }
	                    }
	                }


	            }

	        }
	        int count=0;
	        for(int i=1;i<=N;i++){
	            if(level[i])
	                count++;
	        }
	        System.out.println(count);
	}
}
