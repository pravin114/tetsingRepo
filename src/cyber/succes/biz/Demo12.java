package cyber.succes.biz;

import java.util.ArrayList;

public class Demo12 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
	    a1.add(30);
		System.out.println(a1);
        a1.add("cyber");
        System.out.println(a1);
        System.out.println(a1.contains(40));
        System.out.println(a1.isEmpty());
        a1.addAll(a1);
	}
}
