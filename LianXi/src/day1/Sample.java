package day1;

public class Sample {
	String s="abc";
	char[] aa= {'a','b'};
	public void change(String s,char[] aa){  
s="jff";
aa[0]='s';
	}     
	
	    public static void main(String args[]){       
		Sample ex=new Sample();    
		ex.change(ex.s,ex.aa);       
		System.out.print(ex.s+" and ");   
		System.out.println(ex.aa );  
		} 
}

