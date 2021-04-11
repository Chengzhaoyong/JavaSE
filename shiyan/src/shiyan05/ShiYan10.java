package shiyan05;

public class ShiYan10 {
	public static void main(String[] args) {
		try{
		throw new Exception("抛出Exception异常");
		}catch(Exception ex){
		System.out.println(ex.getMessage());
		}finally{
		System.out.println("异常抛出测试成功！");
		}
}
}