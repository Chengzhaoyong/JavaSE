package demo7;
import java.util.*;
class Graph{
	int vex,arc;
	//int[] vexs;
	int[][] arcs;
	//int[][] path;
	public Graph(int vex,int arc) {
		this.vex=vex;
		this.arc=arc;
		
		this.arcs=new int[vex][vex];
	}
}

public class Main {
	public static Boolean Create(Graph g){
	Scanner sc=new Scanner(System.in);
		for(int i=0;i<g.vex;i++) {
			for(int j=0;j<g.vex;j++) {
				g.arcs[i][j]=-32767;
			
			}
		}
		
		
		for(int k=0;k<g.arc;k++) {
			g.arcs[sc.nextInt()-1][sc.nextInt()-1]=sc.nextInt();
			
		}

		
		for(int k=0;k<g.vex;k++) {
			for(int i=0;i<g.vex;i++) {
				for(int j=0;j<g.vex;j++) {
					if(g.arcs[i][k]+g.arcs[k][j]>g.arcs[i][j]) {
						
							g.arcs[i][j]=g.arcs[i][k]+g.arcs[k][j];
					}
				}
			}
		}
		
		return true;
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int vex=sc.nextInt();
	int arc=sc.nextInt();
	Graph g=new Graph(vex,arc);
	Boolean b=Create(g);
	int max=0;
	if(b) {
		for(int i=0;i<g.vex;i++) {
			for(int j=0;j<g.vex;j++) {
				if(g.arcs[i][j]>max) {
					max=g.arcs[i][j];
				}
			}
		}
		
	}
	
	System.out.println(max);
	
}
}
