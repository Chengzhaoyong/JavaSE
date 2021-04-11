package cn.itcast_04;

public class InterDemo {
		public static void main(String[] args) {
			Inter<String> i=new InterImpl();
			i.show("cheng");
			
			Inter<Integer> ii=new InterImpl();
			ii.show(200);
		}
}
