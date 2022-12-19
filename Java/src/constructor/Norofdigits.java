package constructor;

public class Norofdigits {
public static void main(String[] args) {
	int num=12345;
	int count=0;
	/*while(num!=0) {
		count++;
		num=num/10;
	}*/
	for(int i=0;num!=0;i++) {
		num=num/10;
		count++;
	}
	System.out.println(count);
}
}