package cyber.succes.biz;

import java.util.Scanner;

public class demo23 {





	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter your name:");
	 String name=s.next();
	 System.out.println("enter your age:");
	 int age=s.nextInt();
	 System.out.println("enter your gender:");
	 char gender=s.next().charAt(0);
	 System.out.println("enter your phone no:");
	 long phone=s.nextLong();
	 System.out.println("-----------------------");
	 System.out.println("name:"+name);
	 System.out.println("age:"+age);
	 System.out.println("gender:"+gender);
	 System.out.println("phone:"+phone);




	}

}
