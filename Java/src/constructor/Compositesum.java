package constructor;

public class Compositesum {
public static void main(String[] args) {
	int sum=0;
	for(int j=30;j<=60;j++) {
		int number=j;
		boolean key=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				key=false;
				break;
			}1
		}
		if(key==true) {
			continue;
			
		}
		else {
			sum=sum+number;
		}
	}
	System.out.println(sum);
}
}
