package Demo06;

interface Love{
	public abstract void love();
	
}
class LoveDemo2{
	public void method(Love l) {
		l.love();
	}
}
//���������ʵ�ֽӿ�

class Teacher2 implements Love{ 
	public void love(){
		System.out.println("��ʦ��ѧ������Java��������ϼ");
		
	}
}

public class JieKouXingCan {
	public static void main(String[] args) {
		//������Ҫ����LoveDemo���е�love����
		LoveDemo2 ld=new LoveDemo2();
		Love l=new Teacher2();
		ld.method(l);
	}

}
