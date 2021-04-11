package cn.itcast_03;
/*替换动能：
 *    String 类的public String replaceAll（String regex,String replacement）
 *    使用给定的replacement替换此字符串所有匹配的正则表达式的子字符串
 *    
 *   
 */
public class RegexDemo {
	public static void main(String[] args) {
		String s="helloqq12345kh2243546java";
		//String regex="\\d+";  一个数字以上给*
		//String regex="\\d";   一个数字个一个*
		String regex="\\d+";
       String ss="";
        String result=s.replaceAll(regex, ss);
        System.out.println(result);
	}
}
