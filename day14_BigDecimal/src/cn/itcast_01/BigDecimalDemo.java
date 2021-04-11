package cn.itcast_01;
import java.math.BigDecimal;
/*
 *   构造方法：
 *   public BigDecimal（String val）
 *   
 *   
 *   结果不一样，因为float类型的数据存储和整数不一样，他们大部分的时候，都是带有有效位数字位
 *   由于运算中float类型和double很容易丢失精度，所以java提供了BigDecimal
 *   
 *   public  BigDecimal divide(BigDecimal val,int scale,int roundingMode)
 *   											商，几位小数，如何舍取
 */
public class BigDecimalDemo {
		public static void main(String[] args) {
			System.out.println(0.01+0.09);//结果为0.09999999
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
