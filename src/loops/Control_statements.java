package loops;

public class Control_statements {

	public static void main(String[] args) {
		String username="pravin123";
		String password="p123";
		int a=5;
		int b=1;
		int c=7;
		int d=1;
		int e=9;
		if(username=="pravin12" & password=="p123")
		{
			System.out.println("enetr to the home page");
		}
		else if(username=="pravin123" & password=="p12")
		{
			System.out.println("enter valid credential");
		}
		else
		{
			System.out.println("your login credentialis incorrect is incorrect");
		}
		while(b<=10)
		{
			System.out.println(a*b);
			b++;
		}
	/*	do
		{
			System.out.println(c*d);
			d++;
		}while(d<=10);
*/		
		while(d<=10)
			{
			System.out.println(e*d);
			d++;
			}
			
	}

}
