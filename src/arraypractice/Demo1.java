package arraypractice;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		
		int age[]=new int[6];
		
		age[0]=23;
		age[1]=24;
		age[2]=25;
		age[3]=21;
		age[4]=20;
		age[5]=30;
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(age[i]);
		}
		System.out.println("==========");
		Arrays.sort(age);
		for (int i=0;i<=age.length-1;i++)
		{
		System.out.println(age[i]);	
		}
	}
	
		
	}


