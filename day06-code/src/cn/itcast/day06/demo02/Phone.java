package cn.itcast.day06.demo02;
/*
 * ����һ���࣬����ģ���ֻ�����
 * 
 * �ֻ�������������ɲ��֣�
 * ���ԣ�Ʒ�ƣ��۸���ɫ
 * ��Ϊ����绰������Ϣ
 * 
 * ��Ա������String brand;
 *     double price;
 *     String color;
 * ��Ա������public void call(String who){...}//��绰
 * 			public void sendMessage(){...}//����Ϣ
 * 
 */
public class Phone {
	//��Ա����
			String brand;
			double price;
			String color;
			//��Ա����
			public void call(String who) {
				System.out.println("��"+who+"����Ϣ");
			
		}	
			public void sendMessage(){
				System.out.println("Ⱥ����Ϣ");
			}
			
}
