package cn.itcast_01;
import java.math.BigDecimal;
/*
 *   ���췽����
 *   public BigDecimal��String val��
 *   
 *   
 *   �����һ������Ϊfloat���͵����ݴ洢��������һ�������Ǵ󲿷ֵ�ʱ�򣬶��Ǵ�����Чλ����λ
 *   ����������float���ͺ�double�����׶�ʧ���ȣ�����java�ṩ��BigDecimal
 *   
 *   public  BigDecimal divide(BigDecimal val,int scale,int roundingMode)
 *   											�̣���λС���������ȡ
 */
public class BigDecimalDemo {
		public static void main(String[] args) {
			System.out.println(0.01+0.09);//���Ϊ0.09999999
			//
			BigDecimal s1=new BigDecimal("0.01");
			BigDecimal s2=new BigDecimal("0.09");
			System.out.println(s1.add(s2));
			System.out.println("-------------");
			
			BigDecimal s3=new BigDecimal("1.302");
			BigDecimal s4=new BigDecimal("100");
			System.out.println(s3.divide(s4,3,BigDecimal.ROUND_HALF_UP));
		}
}
