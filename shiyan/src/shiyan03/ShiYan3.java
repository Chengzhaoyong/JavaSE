package shiyan03;
import java.util.Scanner;
public class ShiYan3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���������֣�");
		int s=sc.nextInt();
        System.out.println("�������ַ���");
    	Scanner sc1=new Scanner(System.in);
		String s1=sc1.nextLine();//s1��ʵ����ss;
	    char ss=s1.charAt(0);
		String s3="";
		for(int i=0;i<s;i++){
			s3+=(char)(int)(Math.random()*4+97);
}
		System.out.println("��������ַ�����"+s3);
		int count=0;
		//char[] arr=s3.toCharArray();
		for(int i=0;i<s3.length();i++){
			
			if(s3.charAt(i)==ss){
				count++;
			}
		}
		
		String s4=s3.replace(s1,"");
		//String s4=deleteString2(s3,ss);
		System.out.println("��ͬ������"+count);
		System.out.println("ɾ������ַ���:"+s4);
	}
//	   public static String deleteString2(String str, char delChar) {
//	        StringBuffer stringBuffer = new StringBuffer("");
//	        for (int i = 0; i < str.length(); i++) {
//	            if (str.charAt(i) != delChar) {
//	                stringBuffer.append(str.charAt(i));
//	            }
//	        }
//	        return stringBuffer.toString();
//	    }
}
