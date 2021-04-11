package cn.itcast_02;

public class ObjectToolDemo {

	public static void main(String[] args) {
		ObjectTool ot=new ObjectTool();
	ot.setObj(new String("Ёлувсю"));
	System.out.println(ot.getObj());
	
	ot.setObj(new Integer(100));
	System.out.println(ot.getObj());
	}
}
