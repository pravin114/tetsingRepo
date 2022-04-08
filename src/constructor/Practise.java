package constructor;

public class Practise {

	int a=10;//global non static variable
	static int b=20; //global static variable
	
	public static void main(String[] args) {
		Practise obj=new Practise(24.7f);
		System.out.println("global nonstatic variable is "+obj.a);
		System.out.println("global static variable is "+b);
		System.out.println("global nonstatic variable is ");
		obj.Test();
		obj.Test1();
	}

	public void Test() {
		int c=35;
		System.out.println(c+" "+a+" "+b);
		
	}
	public void Test1()
	{
		int d=45;
		float c=21.4f;
		double sum=a+b+d+c;
		float e=34.6f;
		float multi=a*b*d*e;
		System.out.println(sum);
		System.out.println("multiplication of float value is "+multi);
	}
	public Practise(float h) {
		System.out.println(h);
		System.out.println("my name is pravin salve");
	}
	
}
