package shiyan04;

public class ShiYan09 {
		public static void main(String[] args) {
			int[] arr= {32,1,0,23,567,44,32,23};
			int sum=0;
			float ave;
			int max=arr[0];
			int min=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(max<arr[i]) {
					max=arr[i];
				}
			 if(min>arr[i]){
					min=arr[i];
				}
				sum+=arr[i];
				}
			ave=(float)sum/arr.length;
			System.out.println("最大值；"+max);
			System.out.println("最小值；"+min);
			System.out.println("平均值；"+ave);
			System.out.println("和为："+sum);
		}
}
