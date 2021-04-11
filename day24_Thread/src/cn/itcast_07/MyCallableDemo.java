package cn.itcast_07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyCallableDemo {
		public static void main(String[] args) {
			ExecutorService poor=Executors.newFixedThreadPool(2);
			
			poor.submit(new MyCallable());
			poor.submit(new MyCallable());
			
			poor.shutdown();
		}
}
