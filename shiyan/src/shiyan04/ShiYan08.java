package shiyan04;

public class ShiYan08 {
	public static void main(String[] args) {
        int[] times = new int[6];//6�����ӵ�����,�洢���ֵĴ���
        int n = 100;//ѭ���Ĵ���
     
        for (int i = 0; i < n; i++) {
         int num=(int)(Math.random()*6)+1;
            //int num = (int) (Math.random() * 6) + 1;//����2 �������1~6������
            times[num - 1] = times[num - 1] + 1;//��������1
        }
         
        for (int i = 0; i < times.length; i++) {
        
            System.out.println((i + 1) + "���ֵĴ���" + times[i]+"%");
        }
    }
}
