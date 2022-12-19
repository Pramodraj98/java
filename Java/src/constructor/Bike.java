package constructor;

public class Bike {
String name;
String brand;
int cc;

Bike(String name,String brand,int cc){
	this.name=name;
	this.brand=brand;
	this.cc=cc;
	System.out.println(this.name+" "+this.brand+" "+this.cc);//only name,brand,cc can be used
}
public static void main(String[] args) {
	Bike b1=new Bike("Splendor","Hero honda",90);
	Bike b2=new Bike("Apache","TVS",180);
	Bike b3=new Bike("Himalayan","RE",350);
	Bike b4=new Bike("DIO","Honda",125);
	//System.out.println(b1.name+" "+b2.brand+" "+b3.cc);
}
}
