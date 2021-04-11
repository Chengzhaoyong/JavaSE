package cn.itcast_04;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 *   
 */
public class RegexDemo {
public static void main(String[] args) {
	String s="aaaab";
	String regex="a*b";
	boolean b=s.matches(regex);
	System.out.println(b);
}
}
