package Demo01;
/*
 * �̳��еĹ��췽���Ĺ�ϵ
 * 1.�����е����й��췽��Ĭ�϶�����ʸ����еĹ��췽��
 * 2.Ϊʲô��
 *    ��Ϊ�����̳и����е����ݣ����ܻ���ʹ�ø��������
 *    ���ԣ������ʼ��֮ǰ��һ��Ҫ����ɸ������ݵĳ�ʼ����
 *    
 *    ע�⣺����ÿһ�����췽���ĵ�һ����䶼��Ĭ�϶��ǣ�super������
 * 
 */
class a{
	public a() {
		System.out.println("a���޲������췽��");
	}
	public a(String name) {
		System.out.println("a�Ĵ��������췽��");
	}
}

class b extends a{
	public b() {
		System.out.println("b���޲������췽��");
	}
	public b(String name) {
		System.out.println("b�Ĵ��������췽��");
	}
}
public class ExtendsDemo05 {
	public static void main(String[] args) {
		b s=new b("����ϼ");
		
	}

}
