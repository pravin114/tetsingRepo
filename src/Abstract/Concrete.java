package Abstract;

public class Concrete extends Super{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Concrete obj=new Concrete();
      obj.star();
      obj.test1();
      obj.Star();
      
	}

	@Override
	void star() {
		System.out.println("incomplte method");
		
	}
	void Star()
	{
		System.out.println("dfjsdfnsdfsfsfs");
	}

}
