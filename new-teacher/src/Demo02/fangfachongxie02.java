package Demo02;
/*	������д��ע�����
	1.�����е�˽�з������ܱ���д
	  ��Ϊ����˽�з�������������޷��̳�
	  2.������д���෽��ʱ������Ȩ�޲��ܸ���
	  ���һ��
	  3.���ྲ̬����������Ҳ���뾲̬������д
8*/
class Father{
	public void show() {
		System.out.println("show Father");
	}
}
class Son extends Father{
	public void show() {
		System.out.println("show Son");
	}
}
public class fangfachongxie02 {
		public static void main(String[] args) {
			Son s=new Son();
			s.show();
		}
}
