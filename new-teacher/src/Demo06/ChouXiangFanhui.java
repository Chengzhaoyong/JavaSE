package Demo06;


abstract class Person2{
	public abstract void study();
}

class PersonDemo2{
	public Person2 getPerson2(){
		//Person p=new Student();
		//return p;
		
		return new Student3();
	}
}
class Student3 extends Person2{
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}
public class ChouXiangFanhui {
			public static void main(String[] args) {
				PersonDemo2 pd=new PersonDemo2();
				Person2 p=pd.getPerson2();//new Student3(); 
				p.study();
				
			}
}
