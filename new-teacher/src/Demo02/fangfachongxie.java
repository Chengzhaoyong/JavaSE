package Demo02;
/*
 * ������д����er���г����˺͸����з�������һģһ���ķ�����
 * 
 * �������أ�
 * �����г��ֵķ�����һ���������б�ͬ�ķ������뷵��ֵ�޹ء�
 * 
 * ���������÷�����ʱ��
 * �������౾�����Ҹ���
 * 
 * ������д��Ӧ�ã�
 *   ��������Ҫ����Ĺ��ܵ�ʱ�򣬶����������������Լ����������ݣ�������д�����еķ�����
 *   ����������Ϯ�˸���Ĺ��ܣ��ֶ����������е����ݡ�
 *   
 *   ������
 *   
 *   1.����һ���ֻ��ࣺ
 *   2.ͨ���о����ҷ�����һ���µ��ֻ�������ֻ����������ڴ���绰�󣬿���������Ԥ����
 */
class Phone{
	public void call(String name){
		System.out.println("��"+name+"��绰");
	}
}

class NewPhone extends Phone{
	public void call(String name) {
//		System.out.println("��"+name+"��绰");
		super.call(name);//���ø���Ĺ���
		System.out.println("����������Ԥ����");
	}
}
public class fangfachongxie {
		public static void main(String[] args) {
			NewPhone np=new NewPhone();
			np.call("����ϼ");
		}
}
