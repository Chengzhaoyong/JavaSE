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
//定义b类
class bbb extends aaa{
	public bbb() {
	
	}
	public bbb(String name,int age) {
		super(name,age);//父类的name,age私有的，不能用this访问，只能用super（）
		//this.age=age;
		//this.name=name;
	}
	
}
class ccc extends aaa{
	
}
public class ExtendsDemo08 {
		public static void main(String[] args) {
			//方式1创建对象并测试
			bbb s1=new bbb();
			s1.setName("林青霞");
			s1.setAge(27);
			System.out.println(s1.getName()+"----"+s1.getAge());
			//方式2创建对象并测试
			bbb s2=new bbb("林青霞",27);
			System.out.println(s1.getName()+"----"+s1.getAge());
		}
}
