public class Transfer{
	public static void main(String[] args){
	
		int a = 6;
		int b = 10;
		// 方法 1 异或
		// a = a ^ b;
		// b = a ^ b;
		// a = a ^ b;
		// 方法 2 加法
		// a = a + b;
		// b = a - b;
		// a = a - b;
		// 方法三定义中间量
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);	
		
	
	
	}


}