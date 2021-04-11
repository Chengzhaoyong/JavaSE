package cn.itcast_06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
		public static void main(String[] args) {
			//创建一个线程池对象，控制要创建几个线程对象
			ExecutorService pool=Executors.newFixedThreadPool(2);
			
			pool.submit(new MyRunnable());
			pool.submit(new MyRunnable());
			
			//结束线程池
			pool.shutdown();
			
			
		}
}
