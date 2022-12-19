package Warmup;

public class Patterns {
public static void main(String[] args) {
	
	/*//char ch='a';
	int ty=97;
	for(int i=1;i<=4;i++) {
		int num=1;
		for(int j=1;j<=4;j++) {
			if(i%2==0) {
				System.out.print((char)ty++);
				
			}
			else {
				System.out.print(num++);
				
			}
		}
		System.out.println();
	}*/
	
	/*for(int i=1;i<=4;i++) {
		for(int j=1;j<=4;j++) {
			if(j==3) {
			System.out.print("*");
	}
			else {
				System.out.print(" _");
			}
}
		System.out.println();
}*/
	/*for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
	if(i==j) {
		System.out.print("@");
	}
	else {
		System.out.print(" _");
		
	}
}
		System.out.println();
	}*/
	for(int i=1;i<=5;i++) {
		char ch='a';
		int num=1;
	
		for(int j=1;j<=i;j++) {
			if(i==j){
				System.out.print("@");
			}
			else {
				System.out.print(num++);
			}
		}
			for(int j=6;j>=i;j++) {
				System.out.print(ch++);
			}
			System.out.println();
	}
	}}
