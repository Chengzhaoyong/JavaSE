
import java.util.Calendar;

/*
 *  public int get(int field):���ظ��������ֶε�ֵ���������ÿ���ֶζ��Ǿ�̬�ĳ�Ա������������int����
 */
public class CalendarDemo {
		public static void main(String[] args) {
			//Calendar.getInstance()����ֵΪCalendar������
			Calendar c=Calendar.getInstance();//��̬
			
			int year=c.get(Calendar.YEAR);
			int month=c.get(Calendar.MONTH);
			int day=c.get(Calendar.DATE);
			
			System.out.println(year+"��"+(month+1)+"��"+day+"��");
		}
}
