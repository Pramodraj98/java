package constructor;

public class Revprintindividual {
	public static void main(String[] args) {
		int num=12345; 
		while(num>0) {
			int reminder=num%10;
			System.out.println(reminder);
			num=num/10;
	}
		//System.out.println(num); last num will be printed 
	}
}
