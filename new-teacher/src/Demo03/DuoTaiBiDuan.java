package Demo03;
/*
 * ��̬�ı׶ˣ�
 *    ����ʹ����������й���
 *    
 *    �Ҿ���ʹ����������й��ܡ�
 *    ��ô���أ�
 *    1.�������������÷������ɣ������ԣ����Ǻܶ�ʱ�򲻺������ң�̫ռ�ڴ��ˣ�
 *    
 *    2.�Ѹ��������ǿ��ת��Ϊ��������ã�����ת�ͣ�
 *    e
 *    ������ת�����⣺
 *    ����ת�ͣ�
 *    Fu  f=new Zi();
 *    ����ת�ͣ�
 *    Zi z=(zi)f;//Ҫ���f��ѭ�ܹ�ת��Zi��
 *    
 *    
 *   
 */

class ff{
	int num=10;
	public void show() {
		System.out.println("show Fu");
	}

}
class zz extends ff{
	int num=100;
	public void show() {
		System.out.println("show Zi");
	}
	public  void method() {
		System.out.println("show method");
	}
}
public class DuoTaiBiDuan {
public static void main(String[] args) {
	
//����ת��
		ff f=new zz();
	      f.show();
	   System.out.println(f.num);
//	      f.method();
//��ô�������������еĹ�����	
	      //����ת��
	      zz z=(zz)f;
	      z.method();
	      
	      
	      
	      
	      
	}	    	
	
}
