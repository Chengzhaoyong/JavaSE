package cn.itcast_04;
import java.util.regex.Matcher;

import java.util.regex.Pattern;
/*

 *   ��ȡ���ܣ������ַ���ɵĵ���
 *   da jia ting wo shuo,jin tian yao xia yu,bu yong shang wan zi xi
 */
public class RegexDemo2 {
		public static void main(String[] args) {
			String s=" da jia ting wo shuo,jin tian yao xia yu,bu yong shang wan zi xi";
			String regex="\\b\\w{3}\\b";//\b  ���ʱ߽�
			
			//�ѹ�������ģʽ����
			Pattern p=Pattern.compile(regex);
			//ͨ��ģʽ����õ�ƥ��������
			Matcher m=p.matcher(s);
			//����ƥ����������
			//ͨ��find�������ǲ�����û�������������ִ�
			
			while(m.find()) {
				System.out.println(m.group());
			}
			
			
			
			
			
			
			
			
			
			
		}
}
