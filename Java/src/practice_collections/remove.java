package practice_collections;

import java.util.ArrayList;

public class remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList a=new ArrayList();
	a.add('b');
	a.add(10);
	a.add("hi");
	a.add(true);
	System.out.println(a);
	a.remove(0);
    System.out.println(a);
	a.remove(new Integer(10));
	System.out.println(a);
	}

}
