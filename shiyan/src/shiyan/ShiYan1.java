package shiyan;

class Person {
    private String name;
     private int age;
      private String gender;
      public Person(){}
		public Person(String name, int age, String gender) {
			this.name = name;
			this.age = age;
			this.gender = gender;
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
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
}
  class Student extends Person{
	  private String id;
	  private int cname;
	  private int score;
	  public Student(){
		  
	  }
	public Student(String name, int age, String gender,String id, int cname, int score) {
		super(name,age,gender);
		this.id = id;
		this.cname = cname;
		this.score = score;
	}
	public void display(){
		System.out.println("������"+getName()+" �Ա�"+getGender()+" ���䣺"+getAge()+" id:"+id+" ����:"+cname+" �ɼ�:"+score);
	}
	  
  }
public class ShiYan1 {
		public static void main(String[] args) {
			Student s=new Student("������",20,"��","18251106135",2,90);
			s.display();
		}
}

