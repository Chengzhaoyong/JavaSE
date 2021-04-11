package cn.itcast_09;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class deleteFolder extends TimerTask{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		File srcFolder=new File("demo");
		
		deleteFolder(srcFolder);
		
		
	}
	
	public void deleteFolder(File srcFolder) {
		File[] fileArray=srcFolder.listFiles();
		if(fileArray!=null) {
			for(File file:fileArray) {
				if(file.isDirectory()) {
					deleteFolder(file);
				}
				else {
				System.out.println(file.getName()+":"+file.delete());	
				}
			}
			System.out.println(srcFolder.getName()+":"+srcFolder.delete());
		}
	}
	
}
public class TimerTest {
	public static void main(String[] args) throws ParseException {
		Timer t=new Timer();
		
		String s="2019-9-10 16:50:00";
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;
	    Date d=sdf.parse(s);
	    
		t.schedule(new deleteFolder(),d);
	}

}
