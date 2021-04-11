package cn.itcast_03;

import java.io.IOException;

public class RunTime {
		public static void main(String[] args) throws IOException {
			 Runtime r=Runtime.getRuntime();
			 
			 r.exec("notepad");
		}
}
