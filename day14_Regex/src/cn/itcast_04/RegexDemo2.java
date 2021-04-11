package cn.itcast_04;
import java.util.regex.Matcher;

import java.util.regex.Pattern;
/*

 *   获取动能：三个字符组成的单词
 *   da jia ting wo shuo,jin tian yao xia yu,bu yong shang wan zi xi
 */
public class RegexDemo2 {
		public static void main(String[] args) {
			String s=" da jia ting wo shuo,jin tian yao xia yu,bu yong shang wan zi xi";
			String regex="\\b\\w{3}\\b";//\b  单词边界
			
			//把规则编译程模式对象
			Pattern p=Pattern.compile(regex);
			//通过模式对象得到匹配器对象
			Matcher m=p.matcher(s);
			//调用匹配器对象功能
			//通过find方法就是查找有没有满足条件的字串
			
			while(m.find()) {
				System.out.println(m.group());
			}
			
			
			
			
			
			
			
			
			
			
		}
}
