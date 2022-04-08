package IF_ELSE;

public class Login {

	public static void main(String[] args) {
		String login_id="pravin@123";
		String password="abc123";
		
		if(login_id=="pravin@123")
		{
			System.out.println("enter valid password");
			if(password=="abc1234")
			{
			
			System.out.println("login to the page");
			}
			else
			{
				System.out.println("enter another password");
			}
			}
		
		else
		{
			System.out.println("enter valid login and password ");
		}
	}

}
