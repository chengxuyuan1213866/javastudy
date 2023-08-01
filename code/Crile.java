import java.util.Scanner;
public class Crile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一条边");
		int a = sc.nextInt();
		System.out.println("请输入第二条边");
		int b = sc.nextInt();		
		System.out.println("请输入第三条边");
		int c = sc.nextInt();
		System.out.print((a+b>c)&&(a+c>b)&&(b+c>a) ? "可以组成三角形" : "不可以组成三角形");
	
	}


}