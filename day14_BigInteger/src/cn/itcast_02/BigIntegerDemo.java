package cn.itcast_02;
import java.math.BigInteger;
/*
 *   public BigInteger add(BigInteger val):加
 *   public BigInteger subtract(BigInteger val):减
 *   public BigInteger multiply(BigInteger val):乘
 *   public BigInteger divide(BigInteger val):除
 *   public BigInteger divideAndRemainder(BigInteger val):返回商和余数的数组
 */
public class BigIntegerDemo {
		public static void main(String[] args) {
			BigInteger i=new BigInteger("100");
			BigInteger i1=new BigInteger("50");
			System.out.println("加："+i.add(i1));
			System.out.println("减："+i.subtract(i1));
			System.out.println("乘："+i.multiply(i1));
			System.out.println("除："+i.divide(i1));
			
			BigInteger[] arr=i.divideAndRemainder(i1);
			System.out.println("商为："+arr[0]);
			System.out.println("余数为："+arr[1]);
		}
}
