package shiyan05;

public class ShiYan10 {
	public static void main(String[] args) {
		try{
		throw new Exception("�׳�Exception�쳣");
		}catch(Exception ex){
		System.out.println(ex.getMessage());
		}finally{
		System.out.println("�쳣�׳����Գɹ���");
		}
}
}