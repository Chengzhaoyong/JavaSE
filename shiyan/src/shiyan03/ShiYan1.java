package shiyan03;
import java.util.Random;
public class ShiYan1 {
	public static void main(String[] args) {
        int[] times = new int[10];
        Random r=new Random();
        for (int i = 0; i < 100; i++) {
         int num=(int)r.nextInt(10);
            times[num] = times[num]+1;
        }
          for (int i = 0; i < times.length; i++) {
         System.out.println((i) + "出现的次数" + times[i]+"%");
        }
          System.out.println("----------");
         double[] times1 = new double[10];
          for (int i = 0; i < 1000; i++) {
           int num=(int)r.nextInt(10);
              times1[num] = times1[num] + 1;
          }
            for (int i = 0; i < times.length; i++) {
           System.out.println((i) + "出现的次数" + times1[i]/10+"%");
          } 
    }
}
