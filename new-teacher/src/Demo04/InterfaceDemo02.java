package Demo04;
/*
 * �����ࣺ
 *    �̳й�ϵ��ֻ�ܵ��̳У����Զ��̳�
 * ����ӿڣ�
 *    ʵ�ֹ�ϵ�����Ե�ʵ�֣�Ҳ���Զ�ʵ��
 *    ���һ������ڼ̳�һ�����ͬʱʵ�ֶ���ӿ�
 * �ӿ���ӿڣ�
 *    �̳й�ϵ���Ե��̳У�Ҳ���Զ�̳С�
 */
interface Father{
	public abstract void show();
}
interface Mother{
	public abstract void show2();
}

interface Sister extends Father,Mother{//�ӿ���ӿڣ�
	//   �̳й�ϵ���Ե��̳У�Ҳ���Զ�̳С�
	
	
}
class Son extends Object implements Father,Mother{//����ӿڣ�
	  //  ʵ�ֹ�ϵ�����Ե�ʵ�֣�Ҳ���Զ�ʵ��
	    // ���һ������ڼ̳�һ�����ͬʱʵ�ֶ���ӿ�
	public  void show() {;
	System.out.println("show1 Son ");
	}
	public  void show2() {;
	System.out.println("show2 Son");
	}
}
public class InterfaceDemo02 {
			public static void main(String[] args) {
				Father s=new Son();
				s.show();
				Mother s1=new Son();
				s1.show2();
			}
}
