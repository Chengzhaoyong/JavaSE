package cn.itcast_03;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr={23,45,46,87,97,99,100};
		int index=getIndex(arr,99);
		System.out.println(index);
		
		
	}
	public static int getIndex(int[] arr,int value) {
		int max=arr.length-1;
		int min=0;
		int mid=(max+min)/2;
		while(arr[mid]!=value) {
			if(arr[mid]>value) {
				max=mid-1;
			}
			else {
				min=mid+1;
			}
			mid=(max+min)/2;
			
		}
		return mid;
	
	}

}