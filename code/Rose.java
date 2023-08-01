import java.util.Scanner;

public class Rose{
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("请输入要判断的四位数:");
		int num = Sc.nextInt();
		int q = num/1000;
		int b = (num-q*1000)/100;
		int s = (num-(q*1000)-(b*100))/10;
		int g = (num-(q*1000)-(b*100))%10;
		System.out.printf((num == q*q*q*q+b*b*b*b+s*s*s*s+g*g*g*g) ? "是玫瑰数" : "不是玫瑰数");

		
	}

}