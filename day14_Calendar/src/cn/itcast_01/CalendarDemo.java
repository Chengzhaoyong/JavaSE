
import java.util.Calendar;

/*
 *  public int get(int field):返回给定日历字段的值，日历类的每个字段都是静态的成员变量，并且是int类型
 */
public class CalendarDemo {
		public static void main(String[] args) {
			//Calendar.getInstance()返回值为Calendar的子类
			Calendar c=Calendar.getInstance();//多态
			
			int year=c.get(Calendar.YEAR);
			int month=c.get(Calendar.MONTH);
			int day=c.get(Calendar.DATE);
			
			System.out.println(year+"年"+(month+1)+"月"+day+"日");
		}
}
