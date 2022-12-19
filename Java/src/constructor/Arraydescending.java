package constructor;

import java.util.Scanner;

public class Arraydescending {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int b=sc.nextInt();
	int a[]= new int[b];
	System.out.println("Enter the array values");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
				int c=a[i];
				a[i]=a[j];
				a[j]=c;
			}
		}
	}
	System.out.println();
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
}
}
