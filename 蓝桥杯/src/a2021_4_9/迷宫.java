package a2021_4_9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class �Թ� {
	

	 static int []xx={0,1,0,0,-1};
	    static int []yy={0,0,-1,1,0};
	    public static void main(String arr[]){
	        Scanner input=new Scanner (System.in);

	        int N=30;
	        String []map=new String[N];
	        //���ɵ�ͼ
	        for(int i=0;i<N;i++){
	            map[i]=input.next();
	        }
	        
	        int M=map[0].length();
	        char [][]arrmap=new char[N][M];
	        for(int i=0;i<N;i++){
	            arrmap[i]=map[i].toCharArray();
	        }

	      
	        String [][]res=new String [N][M];
	        //��ʼ������ÿ�����·������Ȼ�������⣬�𰸻��һ��null
	        for(int i=0;i<N;i++){
	            for(int j=0;j<M;j++){
	                res[i][j]="";
	            }
	        }
	        int [][]tempmap=new int[N][M];//����ÿ���Ƿ��Ѿ�������
	        int startx=0;//���
	        int starty=0;

	        //��ʼ������
	        tempmap[startx][starty]=1;
	        Queue <Integer> abscissa=new LinkedList<Integer>();
	        Queue <Integer> vertical=new LinkedList<Integer>();
	        abscissa.offer(startx);
	        vertical.offer(starty);


	       
	        while(!abscissa.isEmpty()&&!vertical.isEmpty()){
	            int motherx=abscissa.poll();
	            int mothery=vertical.poll();

	            // �����ĸ����� D L R U
	            for(int  i=1;i<=4;i++){
	                int tempx=motherx+xx[i];
	                int tempy=mothery+yy[i];

	                //�Ƿ�Խ��
	                if(tempx>=N||tempx<0)
	                    continue;
	                if(tempy>=M||tempy<0)
	                    continue;
	                //�Ƿ�����
	                if(arrmap[tempx][tempy]!='0'){
	                    continue;

	                }
	                //�Ƿ��߹�
	                if(tempmap[tempx][tempy]==1)
	                    continue;
	                    //����� ����¼��һ���ڵ�
	                else{
	                	//���ߵ��������Ӧ�ķ���
	                    String tempans="";
	                    if(i==1)
	                        tempans="D";
	                    if(i==2)
	                        tempans="L";
	                    if(i==3)
	                        tempans="R";
	                    if(i==4)
	                        tempans="U";
	            //�ߵ����������һ������motherx��mothery
	            //ֻ����ϸ�����·�����ϣ��ϸ�����ߵ�������
	            //�ķ�������������·����
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

