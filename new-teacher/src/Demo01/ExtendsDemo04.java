package Demo01;
/*
 * �����ǣ�
 * 1���Ҳ�����Ҫ����ֲ���Χ��num������Ҫ��������Ա��Χ��num����ô�죿
 * 2���һ�����������Ա��Χ��num����ô�죿
 * 
 * this��super������
 * this����������á�
 * super������Ǹ��ഢ��ռ�ı�ʶ���������Ϊ�������ã����Բ��������Ա��
 * 
 * ��ô����
 * 1�����ó�Ա����
 *   this.��Ա���� ���ñ���ĳ�Ա����
 *    super.��Ա����  ���ø���ĳ�Ա����
 *    
 *    2.���ù��췽��
 *    this(...)  ���ñ���Ĺ��췽��
 *    super(...)  ���ø���Ĺ��췽��
 *    
 *    3.���ó�Ա����
 *    this.��Ա����   ���ñ���ĳ�Ա����
 *    super.��Ա����   ���ñ���ĳ�Ա����  
 * 
 * 
 * 
 * 
 */

class Bababa{
	public int num=10;
}
class Zizizi extends Bababa{
	public int num=20;
	public void show() {
		int num=30;
		System.out.println(num);
		System.out.println(this.num);//�����1
		System.out.println(super.num);//�����2
	}
}
public class ExtendsDemo04 {
		public static void main(String[] args) {
			Zizizi s=new Zizizi();
			s.show();
		}
}
