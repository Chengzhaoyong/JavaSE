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
		return "姓名："+getName()+",地址；"+address+",电话；"+phone+",邮件地址："+emailAddress;
		
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
		return  "姓名："+getName()+",地址；"+getAddress()+",电话；"+getPhone()+",邮件地址："+getEmailAddress()+",年级："+Grade;
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
		return  "姓名："+getName()+",地址；"+getAddress()+",电话；"+getPhone()+",邮件地址："+getEmailAddress();
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
		return "受聘日期："+year+"年"+month+"月"+day+"日";
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
		return "姓名："+getName()+",地址；"+getAddress()+",电话；"+getPhone()+",邮件地址："+getEmailAddress()+",职务称号；"+title;
		
	}
}
public class ShiYan2 {
       public static void main(String[] args) {
    	   MyDate m=new MyDate(2018,9,1);
		Person p=new Person("程兆永","广财","12345678900","22343433333@qq.com");
		Student s=new Student("程兆永","广财","12345678900","22343433333@qq.com","大一");
	     Employee e=new Employee("程兆永","广财","12345678900","22343433333@qq.com","广财一教",6000);
	     Faculty f=new Faculty("程兆永","广财","12345678900","22343433333@qq.com","广财一教",6000,9.0,"小白");
	     Staff st=new Staff("程兆永","广财","12345678900","22343433333@qq.com","广财一教",6000,"码农");
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
