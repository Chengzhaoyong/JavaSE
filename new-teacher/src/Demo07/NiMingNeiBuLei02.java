package Demo07;

/*
 * �����ڲ���������⣺
 * ����Ҫ�󣬲������
 *    interface Inter7{
 *    public absrtact void show();
 *    }
 *    class Outer7{//��ȫ����}
 *    class OuterDemo{
                 public static void main(String[] args){
                   Outer.method().show();
                 }
}      //Ҫ�����̨���HelloWorld
 */

interface Inter7{
	public abstract void show();
}
class Outer7{
	//��ȫ����
	public static Inter7 method() {
		return new Inter7() {
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}
public class NiMingNeiBuLei02 {
	public static void main(String[] args) {
		Outer7.method().show();
		//1.Outer.method()���Կ���metho()��һ����̬����
//		2.Outer.method.show()���Կ���method��)���ķ���ֵ��һ������
		//�����ڽӿ���show(),�������ǿ�����Ϊ���ص���һ���ӿ�
		
	}



}
