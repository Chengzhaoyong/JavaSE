package Demo01;


class aaa{
	private String name;
	private int age;
	public aaa() {
		
	}
	public aaa(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
//����b��
class bbb extends aaa{
	public bbb() {
	
	}
	public bbb(String name,int age) {
		super(name,age);//�����name,age˽�еģ�������this���ʣ�ֻ����super����
		//this.age=age;
		//this.name=name;
	}
	
}
class ccc extends aaa{
	
}
public class ExtendsDemo08 {
		public static void main(String[] args) {
			//��ʽ1�������󲢲���
			bbb s1=new bbb();
			s1.setName("����ϼ");
			s1.setAge(27);
			System.out.println(s1.getName()+"----"+s1.getAge());
			//��ʽ2�������󲢲���
			bbb s2=new bbb("����ϼ",27);
			System.out.println(s1.getName()+"----"+s1.getAge());
		}
}
