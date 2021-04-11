package shiyan02;
class Person{
	private String name;
	private String address;
	private String phone;
	private String emailAddress;
	public Person(String name, String address, String phone, String emailAddress) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.emailAddress = emailAddress;
		
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String toString(){
		return "������"+getName()+",��ַ��"+address+",�绰��"+phone+",�ʼ���ַ��"+emailAddress;
		
	}
}
class Student extends Person{
	public static final String Class1="oneclass";
	public static final String Class2="twoclass";
	public static final String Class3="threeclass";
	public static final String Class4="fourclass";
	 private String Grade;
	 public Student(String name, String address, String phone, String emailAddress,String Grade){
		 super(name,address,phone,emailAddress);
		 this.Grade=Grade;
	}
	public String getGrade() {
		return Grade;
	}
	public String toString() {
		return  "������"+getName()+",��ַ��"+getAddress()+",�绰��"+getPhone()+",�ʼ���ַ��"+getEmailAddress()+",�꼶��"+Grade;
	}
}
class Employee extends Person{
	private String office;
	private double salary;
	public Employee(String name, String address, String phone, String emailAddress,String office,double salary){
		 super(name,address,phone,emailAddress);
		 this.office=office;
		 this.salary=salary;
		 
	}
	public String getOffice() {
		return office;
	}
	public double getSalary() {
		return salary;
	}
	public String toString() {
		return  "������"+getName()+",��ַ��"+getAddress()+",�绰��"+getPhone()+",�ʼ���ַ��"+getEmailAddress();
	}
	
}
class MyDate{
	private int year,month,day;
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public String toString() {
		return "��Ƹ���ڣ�"+year+"��"+month+"��"+day+"��";
	}
}
class Faculty extends Employee {
    private double officeHour;
    private String level;
    public Faculty(String name, String address, String phone, String emailAddress,String office,double salary,double officeHour,String level) {
    	super(name,address,phone,emailAddress,office,salary);
    	this.officeHour=officeHour;
    	this.level=level;
    }
	public double getOfficeHour() {
		return officeHour;
	}
	public String getLevel() {
		return level;
	}
}
class Staff extends Employee{
	private String title;
	public Staff(String name, String address, String phone, String emailAddress,String office,double salary,String title){
		super(name,address,phone,emailAddress,office,salary);
		this.title=title;
	}
	public String toString() {
		return "������"+getName()+",��ַ��"+getAddress()+",�绰��"+getPhone()+",�ʼ���ַ��"+getEmailAddress()+",ְ��ƺţ�"+title;
		
	}
}
public class ShiYan2 {
       public static void main(String[] args) {
    	   MyDate m=new MyDate(2018,9,1);
		Person p=new Person("������","���","12345678900","22343433333@qq.com");
		Student s=new Student("������","���","12345678900","22343433333@qq.com","��һ");
	     Employee e=new Employee("������","���","12345678900","22343433333@qq.com","���һ��",6000);
	     Faculty f=new Faculty("������","���","12345678900","22343433333@qq.com","���һ��",6000,9.0,"С��");
	     Staff st=new Staff("������","���","12345678900","22343433333@qq.com","���һ��",6000,"��ũ");
	     System.out.println(p);
	     System.out.println(s);
	     System.out.print(e);
	     System.out.println(","+m);
	     System.out.print(f);
	     System.out.println(","+m);
	     System.out.print(st);
	     System.out.print(","+m);
				
	}
}
