package cn.itcast_01;
/*
 *   һ���쳣
 *   �����쳣�Ĵ���
 *      a:ÿһ��дһ��try  catch
 *      b:дһ��try�����catch
 *      
 *      
 *      JDK7������һ���µ��쳣������
 *      try{
 *        ����
 *      }catch(�쳣1 | �쳣2 |){
 *        ������
 *      }
 *      ȱ�㣺
 *        A������ʽһ��
 *        B������쳣�������ƽ����ϵ
 *        
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int[] arr = new int[3];
		try {
			System.out.println(a / b);// ���һ�������ֹͣ����
			System.out.println(arr[3]);

		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�����±�Խ��");
		} catch (Exception e) {
			System.out.println("��������");

	   }
		System.out.println("over");
		System.out.println("-----------");
		//JDK7�Ĵ�����
		try {
			System.out.println(a / b);// ���һ�������ֹͣ����
			System.out.println(arr[3]);

		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("����������");
		}
		System.out.println("over");
}
}
