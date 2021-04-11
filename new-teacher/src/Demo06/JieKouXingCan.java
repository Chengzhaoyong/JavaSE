package Demo06;

interface Love{
	public abstract void love();
	
}
class LoveDemo2{
	public void method(Love l) {
		l.love();
	}
}
//定义具体类实现接口

class Teacher2 implements Love{ 
	public void love(){
		System.out.println("老师爱学生，爱Java，爱林青霞");
		
	}
}

public class JieKouXingCan {
	public static void main(String[] args) {
		//需求：我要测试LoveDemo类中的love方法
		LoveDemo2 ld=new LoveDemo2();
		Love l=new Teacher2();
		ld.method(l);
	}

}
