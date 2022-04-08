package loops;

public class Factorial {

	public static void main(String[] args) {
		int no=3;
		int i=1;
		int fact =1;
		for(i=1;i<=no;i++)
		{
			fact=i*fact;
		}
    System.out.println(fact);
	}

}
