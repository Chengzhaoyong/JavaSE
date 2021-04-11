package shiyan05;

public class ExceptionDemo extends Exception{
	String message;

ExceptionDemo(String message){
	this.message=message;
}

String getmessage() {
	return message;
}
}
