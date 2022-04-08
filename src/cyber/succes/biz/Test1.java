package cyber.succes.biz;

public class Test1 {
	int a;
	int b;
	int c;
	
	public Test1(int num1,int num2,int num3)
	{
		a=num1;
		b=num2;
		c=num3;
				
	}

	public Test1() {
		//String name;
		//int age;
	}

	public static void main(String[] args) 
	{
	
		

	}
public void multiplication()
{
	int multi=a*b*c;
	System.out.println("multiplication of no is "+multi);
}
public void intro(String name,int age)
{
	System.out.println("my name is "+name);
	System.out.println("my age is "+age);
}
}
