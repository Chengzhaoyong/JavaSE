package cn.itcast_03;
/*�滻���ܣ�
 *    String ���public String replaceAll��String regex,String replacement��
 *    ʹ�ø�����replacement�滻���ַ�������ƥ���������ʽ�����ַ���
 *    
 *   
 */
public class RegexDemo {
	public static void main(String[] args) {
		String s="helloqq12345kh2243546java";
		//String regex="\\d+";  һ���������ϸ�*
		//String regex="\\d";   һ�����ָ�һ��*
		String regex="\\d+";
       String ss="";
        String result=s.replaceAll(regex, ss);
        System.out.println(result);
	}
}
