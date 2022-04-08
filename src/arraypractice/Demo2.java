package arraypractice;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		
	int age []= {12,14,23,324,23,67,897};
	
	//Arrays.sort(age);
	for (int i=0;i<=age.length-1;i++)
	{
		System.out.println(age[i]);
	}
	System.out.println("===========");
	for(int i=age.length-1;i>=0;i--)
	{
		System.out.println(age[i]);
	}

	}

}
