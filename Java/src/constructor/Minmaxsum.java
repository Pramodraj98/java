package constructor;

import java.util.Arrays;

//to find sum of sec min & first max=9+2
public class Minmaxsum {
public static void main(String[] args) {
	int a[]= {2,1,3,6,8,7,9,4};
	/*
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int c=a[i];
				a[i]=a[j];
				a[j]=c;
			}
		}
	}
	*/
	
	/*
	Arrays.sort(a); 
	for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);//for printing arranged values
	*/
	Arrays.sort(a); 
	System.out.println(a[a.length-1]+a[1]);
}
}

