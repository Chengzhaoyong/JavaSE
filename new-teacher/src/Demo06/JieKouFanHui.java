package Demo06;


interface Love1{
	public abstract void love();
}

class LoveDemo{
	public Love1 getLove(){
		//Love l=new Teacher();
//		return l;
		return new Teacher();
	}
}

class Teacher implements Love1{
	public void love() {
		System.out.println("老师爱学生");
	}
}
public class JieKouFanHui {
	public static void main(String[] args) {
		LoveDemo ld=new LoveDemo();
		Love1 l=ld.getLove();//new Teacher();  Love1 l=new Teacher();  多态
		l.love();
	}
			
}
