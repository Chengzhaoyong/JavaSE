package shiyan04;

public class ShiYan08 {
	public static void main(String[] args) {
        int[] times = new int[6];//6个格子的数组,存储出现的次数
        int n = 100;//循环的次数
     
        for (int i = 0; i < n; i++) {
         int num=(int)(Math.random()*6)+1;
            //int num = (int) (Math.random() * 6) + 1;//方法2 随机产生1~6的数字
            times[num - 1] = times[num - 1] + 1;//次数增加1
        }
         
        for (int i = 0; i < times.length; i++) {
        
            System.out.println((i + 1) + "出现的次数" + times[i]+"%");
        }
    }
}
