package practice_collections;

import java.util.ArrayList;

public class listadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add('a');
		a.add("hi");
		a.add(true);
		a.add(1);
//		System.out.println(a);
//		System.out.println(a.size());
		System.out.println(a.get(0));
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}

}
