package cn.itcast_01;
/*
 *   ��̬���룺
 *     ��ʽ��import static ����...������������
 *     ����ֱ�ӵ��뷽���ļ���
 *     
 *     ��̬�����ע�����
 *        A����������ʱ��̬��
 *        B������ж��ͬ���ľ�̬���������ײ�֪��ʹ��˭�����ʱ�򣬱����ǰ׺���ɴ˿ɼ������岻������һ�㲻��
 */

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class StaticImportDemo {
		public static void main(String[] args) {
			//System.out.println(abs(-22));
			//System.out.println(pow(3,3));
			
			System.out.println(java.lang.Math.abs(-22));
			
		
		}
			public void abs() {
				System.out.println(100);
			}
}
