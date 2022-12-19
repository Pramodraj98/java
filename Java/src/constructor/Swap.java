package constructor;

public class Swap {
	static int a=10; 
	int b=20;
public static void main(String[] args) {
	Swap a1=new Swap();
	a1.b=a;
	Swap a2=new Swap();
	a=a2.b;
	
	System.out.println(a+" "+a1.b);
}
}
