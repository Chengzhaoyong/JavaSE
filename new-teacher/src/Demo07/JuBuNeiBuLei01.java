package Demo07;
/*
 *     �ֲ��ڲ��ࣺ
 *      A������ֱ�ӷ����ⲿ��ĳ�Ա
 *      B���ھֲ�λ�ã����Դ�������ͨ����������ڲ���ķ�������ʹ�þֲ��ڲ���Ĺ���
 *      
 *      �����⣺
 *      �ֲ��ڲ�����ʾֲ�������ע������
 *      A���ֲ��ڲ�����ʾֲ�����������final����
 *      B��Ϊʲô��
 *         �ֲ��������ŷ����ĵ��ö����ã����ŵ�����϶���ʧ
 *        �� ���ڴ�����ݲ�����������ʧ�����ԣ����Ǽ�final����
 *        ����final���κ���������ͳ��˳�������Ȼ�ǳ���������ʧ��
 *        �����ڴ��д洢��������20�����ԣ��һ�����������ʹ��
 *        
 */
class Outer5{
	private int num=10;
	public void method() {
		final int num2=20;
		class Inter{
			public void show() {
				System.out.println(num);
				System.out.println(num2);
			}
		}
		Inter i=new Inter();
		i.show();
	}
}
public class JuBuNeiBuLei01 {
	public static void main(String[] args) {
		Outer5 o=new Outer5();
		o.method();
	}


}
