package a2021_4_9;
import java.util.Arrays;
import java.util.Scanner;

import a2021_4_10.Ps;
public class demo3 {



	    public static void main(String[] args) {
	        Scanner input=new Scanner(System.in);
	        int N=input.nextInt();
	        int D=input.nextInt();
	        int K=input.nextInt();
	        Ps[] logs = new Ps[N+1];
	        int ans[]=new int[1000000];
	        int hot[]=new int[1000000];
	        for(int i=0;i<N;i++){
	            int t=input.nextInt();
	            int id=input.nextInt();
	            logs[i] = new Ps(t,id);
	        }
	        Arrays.sort(logs,0,N);
	        for(int i=0,j=0;i<N;i++){
	            hot[logs[i].id]++;
	            while(logs[i].t-logs[j].t>=D){
	                hot[logs[j].id]--;
	                j++;
	            }
	            if(hot[logs[i].id]>=K){
	                ans[logs[i].id]=1;
	            }
	        }
	        for(int i=0;i<1000000;i++){
	            if(ans[i]==1)
	                System.out.println(i);
	        }

	    }

	}

	class Ps implements Comparable<Ps>{
	    public int t;
	    public int id;

	    public Ps(int t,int id){
	        this.t=t;
	        this.id=id;

	    }
	    public int compareTo(Ps o){
	        return Integer.compare(t,o.t);
	    }
	}


