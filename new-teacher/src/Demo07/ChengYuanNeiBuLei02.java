package Demo07;
/*
 *    �����⣺ Ҫ������շֱ����30��20��10
 *    
 *    ע�⣺1.�ڲ�����ⲿ��û�м̳й�ϵ
 *        2.ͨ���ⲿ��������this����
 *           Outer.this
 */
class Outer3{
	public int num=10;
	class Inter{
		public int num=20;
		public void show() {
		int num=30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Outer3.this.num);
		}
	}
}
public class ChengYuanNeiBuLei02 {
		public static void main(String[] args) {
			Outer3.Inter oi=new Outer3().new Inter();
			oi.show();
		}
}
