
public class Reverse {

	public static void main(String[] args) {
		int no=1346;
		int i;
		int rev=0;
while(no!=0)
{
	i=no%10;
	rev=rev*10+i;
	no=no/10;
	
}
       System.out.println(rev);
	}

}
