package Demo01;
/*
 * Java�м̳е��ص㣺
 * 1.Javaֻ֧�ֵ��̳У���֧�ֶ�̳С�
 * ��Щ������֧�ֶ�̳еģ���ʽ��extends ��1����2��....
 * 
 * 2.Java֧�ֶ��̳У��̳���ϵ��
 */
class GrandFather{
	public void show() {
		System.out.println("����үү");
	}
}
class Father extends GrandFather{
	public void Method() {
		System.out.println("���ǰְ�");
	}
}
class Son extends Father{
	
}

class ExtendsDemo01 {
		public static void main(String[] args) {
			Son s=new Son();
			s.Method();
			s.show();
			
		}
}
