package constructor;

public class Amstrongnum {
public static void main(String[] args) {
	int num=153;
	int tempnum=num;
	int actnum=num;
	int count=0;
	while(num>0) {
		count++;
		num/=10;
	}
	System.out.println(count);
	System.out.println(num);
	int sum=0;
	while(tempnum>0) {
		int reminder=tempnum%10;
		sum=sum+(int)Math.pow(reminder, count);
		tempnum/=10;
	}
	System.out.println(sum);
	if(sum==actnum) {
		System.out.println("It is amstrongnum");
	}
	else {
		System.out.println("It is not");
	}
}
}
