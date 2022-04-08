package cyber.succes.biz;

public class New1 {
int a;
int b;
int c;
public New1() {
	int a=15;
	int b=20;
	int c=30;
			
	System.out.println("this is non paramatrized const ");

}
public New1(int num1) {
	   a = num1;
}
public New1(int num1,int num2,int num3)
{
	a=num1;
	b=num2;
	c=num3;
}
public static void main(String[] args) {
	New1 obj1=new New1(25,35,45);
	obj1.addition();
	New1 obj=new New1(10);
	obj.addition();
	
}
public void addition()
{

	int sum=a+b+c;
	System.out.println("addition of variable "+sum);
}
}