package Demo03;
/*
 * final���α����ĳ�ʼ��
 * 1.final���εı���ֻ�ܸ�ֵһ��
 * 2.�ڹ��췽�����ǰ���Ǿ�̬�ĳ�����
 */
class Demo{
	final int num=10;
	
	public Demo(){
//		num=200;//�޷��ڶ��θ�ֵ
	}
}
public class final02 {
		public static void main(String[] args) {
			Demo s=new Demo();
			System.out.println(s.num);
		}
}
