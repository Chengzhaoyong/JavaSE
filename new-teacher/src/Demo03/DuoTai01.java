package Demo03;

/*
 * ��̬��ǰ�᣺
 *   A��Ҫ�м̳й�ϵ
 *   B��Ҫ�з�����д
 *      ��ʵû��Ҳ�ǿ��Եģ��������û�������û�����塣
 *      ����   d =new è������
 *      d.show();
 *      ����   d =new ��������
 *      d.show();
 *    C��Ҫ�и�������ָ���������
 *    ��   f=new �ӣ���;
 *    
 *   ��̬�еĳ�Ա�����ص㣺
 *    A����Ա����
 *    ���뿴���    ���п����
 *    B�����췽��
 *    �����������ĵ�ʱ�򣬷��ʸ���Ĺ��췽�����Ը�������ݽ��г�ʼ��
 *   
*       
 *     *    C����Ա����
 *      ���뿴���    ���п��ұߡ�
          D:��̬������
 *        ���뿴���    ���п����
 *        ����̬������أ��㲻����д�����ʻ��ǿ���ߣ�
 *        ���ڳ�Ա��������д�����Ա��뿴���
 *    
         
 */
class Fu{
	public int num=100;
	public void show() {
		System.out.println("show Fu");
	}
	public static void function() {
		System.out.println("function Fu");
	}
}
class Zi extends Fu{
	    public int num=1000;
	    public int num2=100;
	    public void show() {
		System.out.println("show Zi");
		
	}
	    public void method() {
			System.out.println("method Zi");
		}
	    public static void function() {
			System.out.println("function zi");
		}
}
public class DuoTai01 {
		public static void main(String[] args) {
			//Ҫ�и�������ָ���������
			Fu f=new Zi();
			System.out.println(f.num);
			f.show();
//			f.method();
		  f.function();
			
			
			
		}
}
