package cn.itcast_06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
		public static void main(String[] args) {
			//����һ���̳߳ض��󣬿���Ҫ���������̶߳���
			ExecutorService pool=Executors.newFixedThreadPool(2);
			
			pool.submit(new MyRunnable());
			pool.submit(new MyRunnable());
			
			//�����̳߳�
			pool.shutdown();
			
			
		}
}
