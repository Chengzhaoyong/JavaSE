package cn.itcast_02;

public class Teacher {
		private Teacher() {
			
		}
		
		static Teacher t=null;
		public static Teacher getTeacher() {
			if(t==null) {
				t=new Teacher();
				
			}
			return t;
			
		}
}
