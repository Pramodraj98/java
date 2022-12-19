package constructor;

public class Revprint {
	public static void main(String[] args) {
		int num=1234;
		int sum=0;
		while(num>0) {
			int reminder=num%10;
			sum=(sum*10)+reminder;
			num=num/10;
		}
		num=sum;
		System.out.println(num);
	}
}
