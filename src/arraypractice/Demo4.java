package arraypractice;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		
		String name[]= {"pravin","rajesh","akshay","mayur"};
		
		Arrays.sort(name);
		for(int i=1;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
	}

}
