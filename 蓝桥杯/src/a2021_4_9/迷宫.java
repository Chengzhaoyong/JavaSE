package a2021_4_9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 迷宫 {
	

	 static int []xx={0,1,0,0,-1};
	    static int []yy={0,0,-1,1,0};
	    public static void main(String arr[]){
	        Scanner input=new Scanner (System.in);

	        int N=30;
	        String []map=new String[N];
	        //生成地图
	        for(int i=0;i<N;i++){
	            map[i]=input.next();
	        }
	        
	        int M=map[0].length();
	        char [][]arrmap=new char[N][M];
	        for(int i=0;i<N;i++){
	            arrmap[i]=map[i].toCharArray();
	        }

	      
	        String [][]res=new String [N][M];
	        //初始化到达每个点的路径，不然会有问题，答案会带一个null
	        for(int i=0;i<N;i++){
	            for(int j=0;j<M;j++){
	                res[i][j]="";
	            }
	        }
	        int [][]tempmap=new int[N][M];//来看每个是否已经遍历过
	        int startx=0;//起点
	        int starty=0;

	        //初始化队列
	        tempmap[startx][starty]=1;
	        Queue <Integer> abscissa=new LinkedList<Integer>();
	        Queue <Integer> vertical=new LinkedList<Integer>();
	        abscissa.offer(startx);
	        vertical.offer(starty);


	       
	        while(!abscissa.isEmpty()&&!vertical.isEmpty()){
	            int motherx=abscissa.poll();
	            int mothery=vertical.poll();

	            // 遍历四个方向 D L R U
	            for(int  i=1;i<=4;i++){
	                int tempx=motherx+xx[i];
	                int tempy=mothery+yy[i];

	                //是否越界
	                if(tempx>=N||tempx<0)
	                    continue;
	                if(tempy>=M||tempy<0)
	                    continue;
	                //是否能走
	                if(arrmap[tempx][tempy]!='0'){
	                    continue;

	                }
	                //是否走过
	                if(tempmap[tempx][tempy]==1)
	                    continue;
	                    //保存答案 ，记录下一个节点
	                else{
	                	//看走到这个结点对应的方向
	                    String tempans="";
	                    if(i==1)
	                        tempans="D";
	                    if(i==2)
	                        tempans="L";
	                    if(i==3)
	                        tempans="R";
	                    if(i==4)
	                        tempans="U";
	            //走到这个结点的上一结点就是motherx和mothery
	            //只需把上个结点的路径加上，上个结点走到这个结点
	            //的方向就是这个结点的路径；
	                    res[tempx][tempy]=(res[motherx][mothery]+tempans);
	                    abscissa.offer(tempx);
	                    vertical.offer(tempy);
	                    tempmap[tempx][tempy]=1;

	                }
	            }
	        }
	        System.out.print(res[N-1][M-1]);
	        System.out.println(res[N-1][M-1].length());

	    }

	}

