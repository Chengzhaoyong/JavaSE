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
			System.out.println("���ֵ��"+max);
			System.out.println("��Сֵ��"+min);
			System.out.println("ƽ��ֵ��"+ave);
			System.out.println("��Ϊ��"+sum);
		}
}
