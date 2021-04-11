package cn.itcast_08;
/*
 *   我们自己随意写的类不能看成异常类，必须继承Exception和RuntimeException
 *   
 */
public class MyException extends Exception {

	
public MyException() {
	
}
 public MyException(String message) {
    super(message);
 }}