package cn.itcast_02;
import java.math.BigInteger;
/*
 *   public BigInteger add(BigInteger val):��
 *   public BigInteger subtract(BigInteger val):��
 *   public BigInteger multiply(BigInteger val):��
 *   public BigInteger divide(BigInteger val):��
 *   public BigInteger divideAndRemainder(BigInteger val):�����̺�����������
 */
public class BigIntegerDemo {
		public static void main(String[] args) {
			BigInteger i=new BigInteger("100");
			BigInteger i1=new BigInteger("50");
			System.out.println("�ӣ�"+i.add(i1));
			System.out.println("����"+i.subtract(i1));
			System.out.println("�ˣ�"+i.multiply(i1));
			System.out.println("����"+i.divide(i1));
			
			BigInteger[] arr=i.divideAndRemainder(i1);
			System.out.println("��Ϊ��"+arr[0]);
			System.out.println("����Ϊ��"+arr[1]);
		}
}
